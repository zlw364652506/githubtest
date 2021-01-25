package com.aj.frame.auth.controller;

import com.aj.frame.beans.AJOutData;
import com.aj.frame.um.usm.beans.User;
import com.aj.frame.auth.apibeans.AppAndResourceAuthInput;
//import com.aj.frame.auth.apibeans.AuthInput;
import com.aj.frame.auth.apibeans.UserAndAppAuthInput;
import com.aj.frame.auth.common.bean.Result;
import com.aj.frame.auth.service.AuthorizationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Api(tags = { "鉴权相关接口" })
@RestController
public class AuthorizationController {

    @Resource
    AuthorizationService authorizationService;

    @ApiOperation(value = "鉴权应用和资源", httpMethod = "POST")
    @PostMapping("/auth/v1/auth/appAndResource")
    public Result getAppAndResourceAuth(@RequestBody AppAndResourceAuthInput input, HttpServletRequest request) throws Exception {
        App app = new App();
        app.setAppId(input.getAppId());
        app.setOrgCode(input.getAppRegionalismCode());

        AppResource resource = new AppResource();
        resource.setResourceId(input.getResourceId());
        resource.setOrgCode(input.getResourceRegionalismCode());

        AJOutData odata = authorizationService.getAppAndResourceAuth(app, resource);
        return Result.error(odata.getCode(), odata.getMessage());
    }

    @ApiOperation(value = "鉴权用户和应用", httpMethod = "POST")
    @PostMapping("/auth/v1/auth/userAndApp")
    public Result getUserAndAppAuth(@RequestBody UserAndAppAuthInput input, HttpServletRequest request) throws Exception {
        UserExt ue = new UserExt();
        ue.setOrgCode(input.getPersonRegionalismCode());

        User user = new User();
        user.setUserName(input.getPersonId());

        App app = new App();
        app.setAppId(input.getAppId());
        app.setOrgCode(input.getAppRegionalismCode());
        app.setRegionalism(Long.parseLong(input.getNetworkAreaCOde()));
        // TODO: 遗落一个包名

        AJOutData odata =  authorizationService.getUserAndAppAuth(app, user, ue);
        return Result.error(odata.getCode(), odata.getMessage());
    }
}
