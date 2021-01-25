package com.aj.frame.auth.controller;

import com.aj.frame.api.F;
import com.aj.frame.api.Ids;
import com.aj.frame.auth.api.beans.headers.Headers;
import com.aj.frame.beans.AJOutData;
import com.aj.frame.auth.IdStringToken;
import com.aj.frame.auth.api.beans.headers.Credential;
import com.aj.frame.auth.common.bean.*;
import com.aj.frame.auth.common.util.ProcessorCallerUtil;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.aj.frame.auth.service.AuthenticationService;
import com.alibaba.fastjson.JSON;


import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;


@Api(tags = { "认证相关接口" })
@RestController
public class AuthenticationController {

    @Resource
    AuthenticationService authenticationService;

    @ApiOperation(value = "App用户登录", httpMethod = "POST")
    @PostMapping("/auth/v1/auth/login")
    public Result getUserList(@RequestBody LoginBean loginBean, HttpServletResponse response) throws Exception {
        AJOutData odata = authenticationService.appLogin(loginBean.getUser(), loginBean.getSessionDetails());
        if (odata.getCode() == Ids.Ajf.Errors.成功.getId()) {
            String gid = odata.getSessionData().getGid();
            F.log().d("登录成功：GID=" + gid);
            // 将登录成功返回的gid存到Authorization，用于当前用户后续调用接口时获取
            response.addHeader(ProcessorCallerUtil.Authorization, gid);
            // 将登录成功返回的gid存到Cookie，用于当前用户后续调用接口时获取，前端目前无法获取
            response.addCookie(new Cookie(ProcessorCallerUtil.GidCookieName, gid));
            // TODO: 生成一个code
            return Result.ok(odata.getDatas(UserExt.class));

        } else if (odata.getCode() == IdStringToken.auth.Errors.用户不存在.getId()) {
            // 用户不存在，需要前段跳转到实名认证，返回一个特定值
            return Result.error(1000, IdStringToken.auth.Errors.用户不存在.getName());

        } else {
            return Result.error(odata.getMessage());
        }
    }

    @ApiOperation(value = "政务微信登录", httpMethod = "GET")
    @GetMapping("/auth/v1/auth0/weworklogin")
    public Result getCurrentUser(
            @RequestParam("code") String code,
            @RequestParam("msg_signature") String msgSignature,
            @RequestParam("timestamp") String timestamp,
            @RequestParam("nonce") String nonce) throws Exception {

        // 1. 进行签名鉴权，校验请求的有效性
        authenticationService.checkSignature(msgSignature, timestamp, nonce);

        // 2. 检测用户授权code的有效性。如果code有效，则返回用户数据
        authenticationService.checkCode(code);

        // 3. 返回当前的用户数据
        authenticationService.getUserByCode(code);
        return null;
    }

    @ApiOperation(value = "验证用户权限", httpMethod = "POST")
    @PostMapping ("/auth/v1/verifyUserAuthor")
    public OutData verifyUserAuthor(@RequestBody InData inData, HttpServletRequest request) throws Exception {
        //用户凭证
        String userCredentialStr = request.getHeader("userCredential");
        userCredentialStr = URLDecoder.decode(userCredentialStr, "utf-8");
        F.log().i(String.format("userCredential=%s",userCredentialStr));
        JSONObject jsonObject =  JSON.parseObject(userCredentialStr);
        userCredentialStr = jsonObject.getString("credential");
        Credential userCredential = JSON.parseObject(userCredentialStr, Credential.class);
        //APP凭证
        String appCredentialStr = request.getHeader("appCredential");
        appCredentialStr = URLDecoder.decode(appCredentialStr, "utf-8");
        JSONObject jsonObject2 =  JSON.parseObject(appCredentialStr);
        appCredentialStr = jsonObject2.getString("credential");
        Headers headers = new Headers();
        Credential appCredential = JSON.parseObject(appCredentialStr, Credential.class);

        headers.setUserCredential(userCredential);
        headers.setAppCredential(appCredential);
        String messageId = request.getHeader("messageId");
        headers.setMessageId(messageId);
        return authenticationService.verifyUserAuthor(headers);
    }

//    public static void main(String[] args) {
//        String str="{\"credential\":{\"head\":{\"version\":\"1.0\",\"credType\":\"1\",\"token\":{\"tokenId\":\"a000000120123123123123123ec892ba\",\"orgId\":\"120000000000\",\"exten\":\"\"},\"duration\":{\"startTime\":\"2012312312231\",\"endTime\":\"2012312312290\"}},\"load\":{\"userInfo\":{\"userId\":\"b000000120123123123123123ec892ba\",\"orgId\":\"120000000000\",\"sfzh\":\"410184197910211212\",\"jh\":\"999999\",\"xm\":\"韩秀德\",\"exten\":\"\"}},\"serverSign\":{\"alg\":\"SM3+SM2\",\"signature\":\"b000000120123123123123123ec892ba\",\"sn\":\"1000000000100211\",\"url\":\"http://20.3.1.166/UAS/Credential.do\"},\"clientSign\":{\"alg\":\"SM3+SM2\",\"signature\":\"b000000120123123123123123ec892ba\",\"sn\":\"1000000000100001\"}}}";
//        JSONObject jsonObject =  JSON.parseObject(str);
//        String str2 = jsonObject.getString("credential");
//        Credential userCredential = JSON.parseObject(str, Credential.class);
//        System.out.println(userCredential.getHead());
//
//    }

}
