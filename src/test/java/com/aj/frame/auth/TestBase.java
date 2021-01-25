package com.aj.frame.auth;

import com.aj.frame.api.F;
import com.aj.frame.api.util.ProcessorCaller;
import com.aj.frame.beans.AJFrameSessionData;
import com.aj.frame.beans.AJInData;
import com.aj.frame.beans.AJOutData;
import com.aj.frame.auth.common.bean.Result;
import com.aj.frame.auth.common.util.ProcessorCallerUtil;
import com.aj.frame.um.Ids;
import com.aj.frame.um.usm.beans.SessionDetails;
import com.aj.frame.um.usm.beans.User;
import com.aj.frame.um.util.Md5Password;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.servlet.http.Cookie;

@SpringBootTest
@TestMethodOrder(MethodOrderer.Alphanumeric.class) // 使用字母顺序
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // 此注解可以使BeforeAll方法不用static
@AutoConfigureMockMvc // 自动注入mockMvc
public class TestBase {

//	@Autowired
//	protected WebApplicationContext webApplicationContext;

    @Autowired // json工具
    protected ObjectMapper objectMapper;

    @Autowired
    protected MockMvc mockMvc;

    private static String gid = null;

    private static UserExt loginedUser;

    protected static String login(String testUserName, String testUserPwd) throws Exception {
        if (gid != null) {
            return gid;
        }
        User user = new User(testUserName, new Md5Password(testUserPwd).toString());
        SessionDetails sd = new SessionDetails();
        sd.setCertSn("CSN:123456");
        sd.setDeviceSn(user.getUserName());
        sd.setMac("MAC:123456");
        sd.setOs("WINDOWS");
        sd.setVersion("junit");
        String procId = IdStringToken.auth.DefaultProcessorIds.App用户登入.name();
        AJInData ajInData = new AJInData(procId, new Object[]{user, sd});
        AJOutData outdata = ProcessorCallerUtil.callWait(null, ajInData);

        F.log().d(String
                .format("用户'%s'调用'%s'登入（%s, %d）", user.getUserName(), procId, outdata.getMessage(), outdata.getCode()));
        Assertions.assertEquals(outdata.getCode(), Ids.Ajf.Errors.成功.getId());
        loginedUser = outdata.getData(UserExt.class);
        Assertions.assertNotNull(loginedUser, "登录返回的UserExt为null");

        String sessionId = outdata.getSessionData().getGid();
        TestBase.gid = sessionId;
        return sessionId;
    }

    private void logout() {
        if (gid != null) {
            ProcessorCaller caller = new ProcessorCaller();
            AJFrameSessionData sd = new AJFrameSessionData();
            sd.setGid(gid);
            caller.setSessionData(sd);
            AJOutData outdata = null;
            outdata = caller.callWait(new AJInData(Ids.Um.DefaultProcessorIds.USMBC_用户登出.name()), 1000);
            F.log().d(String.format("用户'%s'登出（%s, %d）", loginedUser == null ? "" : loginedUser.getUser().getUserName(),
                    outdata.getMessage(), outdata.getCode()));
            Assertions.assertEquals(outdata.getCode(), Ids.Ajf.Errors.成功.getId());
        }
        loginedUser = null;
    }

    @BeforeEach
    public void beforeEach() throws Exception {
        System.out.println("beforeEach");
//		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    /**
     * GET请求测试
     *
     * @param uri
     * @return
     * @throws Exception
     */
    protected ResultActions getTest(String uri) throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get(uri);
        return requestTest(requestBuilder);
    }

    /**
     * POST请求测试
     *
     * @param uri
     * @param json
     * @return
     * @throws Exception
     */
    protected ResultActions postTest(String uri, Object obj) throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post(uri);
        if (obj != null) {
            requestBuilder.accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
                    .content(objectMapper.writeValueAsString(obj));
        }
        return requestTest(requestBuilder);
    }

    private ResultActions requestTest(MockHttpServletRequestBuilder requestBuilder) throws Exception {
        requestBuilder.characterEncoding("utf-8");

        if (gid != null) {
            requestBuilder.cookie(new Cookie(ProcessorCallerUtil.GidCookieName, gid));
        }
        ResultActions resultActions = mockMvc.perform(requestBuilder);
        MockHttpServletResponse response = resultActions.andReturn().getResponse();
        response.setCharacterEncoding("UTF-8");
        resultActions.andDo(MockMvcResultHandlers.print()); // 打印请求返回
        resultActions.andExpect(MockMvcResultMatchers.status().isOk());

        //得到返回结果
        Result result = objectMapper.readValue(response.getContentAsString(), Result.class);
        Assertions.assertEquals(result.get(Result.CODE_TAG), 0);
        return resultActions;
    }

    @AfterAll
    public void afterAll() {
        System.out.println("afterAll");
        logout();
        F.uninitialize();
    }

}
