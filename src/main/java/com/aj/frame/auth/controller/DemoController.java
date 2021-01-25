package com.aj.frame.auth.controller;


import com.aj.frame.um.usm.beans.User;
import com.aj.frame.auth.common.bean.Result;
import com.aj.frame.auth.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = { "Demo示例操作相关接口" })
@RestController
public class DemoController {

    @Resource
    DemoService demoService;

    @ApiOperation(value = "Demo示例查询当前用户", httpMethod = "GET")
    @GetMapping("/auth/v1/demo/user/current")
    public Result getCurrentUser() throws Exception {
        Result result = Result.ok(demoService.getCurrentUser());
        return result;
    }

    @ApiOperation(value = "Demo示例查询用户列表", httpMethod = "POST")
    @PostMapping("/auth/v1/demo/user/list")
    public Result getUserList(@RequestBody User user) throws Exception {
        Result result = Result.ok(demoService.getCurrentUser());
        return result;
    }
}

