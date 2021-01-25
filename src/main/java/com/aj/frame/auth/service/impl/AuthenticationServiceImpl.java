package com.aj.frame.auth.service.impl;

import com.aj.frame.api.F;
import com.aj.frame.auth.api.beans.headers.Headers;
import com.aj.frame.beans.AJInData;
import com.aj.frame.beans.AJOutData;
import com.aj.frame.um.Ids;
import com.aj.frame.um.usm.beans.SessionDetails;
import com.aj.frame.um.usm.beans.User;
import com.aj.frame.auth.IdStringToken;
import com.aj.frame.auth.common.util.ProcessorCallerUtil;
import com.aj.frame.auth.service.AuthenticationService;
import com.qq.weixin.mp.aes.AesException;
import com.qq.weixin.mp.aes.SHA1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Value("${auth.token}")
    String token;

    @Override
    public AJOutData appLogin(User user, SessionDetails sd) throws Exception {
        String procId = IdStringToken.auth.DefaultProcessorIds.App用户登入.name();
        AJInData ajInData = new AJInData(procId, new Object[]{user, sd});
        AJOutData outdata = ProcessorCallerUtil.callWait(null, ajInData);
        return outdata;
    }

    @Override
    public void checkSignature(String signatrue, String timestamp, String nonce) throws ResponseStatusException {
        try {
            String expectedSignature = SHA1.getSHA1(token, timestamp, nonce);
            if (!expectedSignature.equals(signatrue)) {
                String reason = "签名鉴权,期望签名为：" + expectedSignature + " 实际签名为：" + signatrue;
                F.log().w(reason);
                throw new ResponseStatusException(HttpStatus.FORBIDDEN, reason);
            }
        } catch (AesException e1) {
            e1.printStackTrace();
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, e1.getLocalizedMessage());
        }
    }

    /**
     * 检查Code有效性
     * TODO: Complete Me!!
     * @param code
     * @throws Exception
     */
    @Override
    public void checkCode(String code) throws Exception {
        
    }

    @Override
    public UserExt getUserByCode(String code) throws Exception {
        AuthToken token = new AuthToken();
        token.setToken(code);

        String procId = IdStringToken.auth.DefaultProcessorIds.获取政务微信用户信息.name();
        AJInData inData = new AJInData(procId, new Object[]{ token });
        AJOutData ajOutData = ProcessorCallerUtil.callWait(inData);
        if (ajOutData.getCode() == Ids.Ajf.Errors.成功.getId()) {
            return ajOutData.getData(UserExt.class);
        } else {
            throw new Exception(ajOutData.getMessage());
        }
    }

    @Override
    public OutData verifyUserAuthor(Headers headers) throws Exception {

        AJInData aJInData = new AJInData(IdStringToken.auth.DefaultProcessorIds.验证用户权限.name());
        aJInData.putData(headers);
        AJOutData ajOutData = ProcessorCallerUtil.callWait(aJInData);
        if (ajOutData.getCode() == Ids.Ajf.Errors.成功.getId()) {
            OutData outData = new OutData();
            outData.setCode(ajOutData.getCode());
            outData.setMessage(ajOutData.getMessage());
            outData.setData(ajOutData.getData(VerifyUserCredentials.class));
            return outData;
        } else {
            throw new Exception(ajOutData.getMessage());
        }
    }

}
