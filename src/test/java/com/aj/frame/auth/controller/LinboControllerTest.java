package com.aj.frame.auth.controller;

import com.aj.frame.um.usm.beans.SessionDetails;
import com.aj.frame.um.usm.beans.User;
import com.aj.frame.um.util.Md5Password;
import com.aj.frame.auth.IdStringToken;
import com.aj.frame.auth.TestBase;
import com.aj.frame.auth.apibeans.AppAndResourceAuthInput;
import com.aj.frame.auth.apibeans.UserAndAppAuthInput;
import com.aj.frame.auth.common.bean.LoginBean;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LinboControllerTest extends TestBase {

    private static String testUserName = "liuling";

    private static String testUserPwd = "";

    private String publicKey = "rO0ABXNyABRqYXZhLnNlY3VyaXR5LktleVJlcL35T7OImqVDAgAETAAJYWxnb3JpdGhtdAASTGphdmEvbGFuZy9TdHJpbmc7WwAHZW5jb2RlZHQAAltCTAAGZm9ybWF0cQB+AAFMAAR0eXBldAAbTGphdmEvc2VjdXJpdHkvS2V5UmVwJFR5cGU7eHB0AANSU0F1cgACW0Ks8xf4BghU4AIAAHhwAAAAXjBcMA0GCSqGSIb3DQEBAQUAA0sAMEgCQQCCmRBRz4oUehsuHrZY9MYpYXl8SZ2wh8a7PgGu6abkDevg6xWJ5RuOBprnItYZU+8cFsNFm//1qne4QZmR/A6zAgMBAAF0AAVYLjUwOX5yABlqYXZhLnNlY3VyaXR5LktleVJlcCRUeXBlAAAAAAAAAAASAAB4cgAOamF2YS5sYW5nLkVudW0AAAAAAAAAABIAAHhwdAAGUFVCTElD";

    @BeforeAll
    void beforeAll() throws Exception {
        System.out.println("beforeAll");
        TestBase.login(testUserName, testUserPwd);
    }

    @Test
    void test_AppLogin() throws Exception {

        User user = new User(testUserName, new Md5Password(testUserPwd).toString());
        SessionDetails sd = new SessionDetails();
        sd.setCertSn("CSN:123456");
        sd.setDeviceSn(user.getUserName());
        sd.setMac("MAC:123456");
        sd.setOs("WINDOWS");
        sd.setVersion("junit");
        String procId = IdStringToken.auth.DefaultProcessorIds.App用户登入.name();

        LoginBean loginBean = new LoginBean();
        loginBean.setUser(user);
        loginBean.setSessionDetails(sd);
        postTest("/auth/v1/auth/login", loginBean);
    }

    @Test
    void test_Demo() throws Exception {
        getTest("/auth/v1/user/current");
    }

    @Test
    void test_AppResource_get() throws Exception {
        getTest("/auth/v1/appresources/7430100000000201");
    }

    @Test
    void test_AppResource_getList() throws Exception {
        getTest("/auth/v1/appresources");
    }

    // 鉴权应用和资源
    @Test
    void test_getAppAndResourceAuth() throws Exception {
        AppAndResourceAuthInput input = new AppAndResourceAuthInput();
        input.setAppId("appId001");
        input.setAppRegionalismCode("orgCode001");
        input.setResourceId("TEST-2020-08-13-101259");
        input.setResourceRegionalismCode("资源归属机构代码");

        postTest("/auth/v1/auth/appAndResource", input);
    }

    // 鉴权用户和应用
    @Test
    void test_getUserAndAppAuth() throws Exception {
        UserAndAppAuthInput input = new UserAndAppAuthInput();
        input.setAppId("appId001");
        input.setAppPackage("appPackage001");
        input.setAppRegionalismCode("orgCode001");
        input.setNetworkAreaCOde("1");
        input.setPersonId("admin");
        input.setPersonRegionalismCode("orgCode002");

        postTest("/auth/v1/auth/userAndApp", input);
    }
}
