package com.aj.frame.auth.common.util;


import com.aj.frame.api.F;
import com.aj.frame.api.util.ProcessorCaller;
import com.aj.frame.beans.*;
import com.aj.frame.um.Ids;
import com.aj.frame.um.usm.beans.SessionDetails;
import com.aj.frame.um.usm.beans.User;
import com.aj.frame.um.util.Md5Password;
import com.aj.frame.auth.common.bean.Result;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 调用框架服务工具类
 */
public class ProcessorCallerUtil {

    public static final String GidCookieName = "AJFSESSIONID";

    public static final String Authorization = "Authorization";

    private static String testUserName = "liuling";

    private static String testUserPwd = "";

    public static boolean debug = false;

    /**
     * 传入gid，调用远程接口，返回不是成功不抛出异常
     *
     * @param gid
     * @param inData
     * @return
     */
    public static AJOutData callWaitNoException(String gid, AJInData inData) {
        ProcessorCaller caller = new ProcessorCaller();
        AJFrameSessionData ajFrameSessionData = new AJFrameSessionData();
        ajFrameSessionData.setGid(gid);
        caller.setSessionData(ajFrameSessionData);
        return caller.callWait(inData);
    }

    /**
     * 调用远程接口，返回不是成功不抛出异常
     *
     * @param inData
     * @return
     */
    public static AJOutData callWaitNoException(AJInData inData) {
        String gid = null;
        try {
            gid = getGidFromAuthorization();
        }
        catch (Exception e) {
        }

        return callWaitNoException(gid, inData);
    }

    /**
     * 传入gid，调用远程接口，返回不是成功则抛出异常
     *
     * @param gid
     * @param inData
     * @return
     * @throws Exception
     */
    public static AJOutData callWait(String gid, AJInData inData) throws Exception {
        AJOutData ajOutData = callWaitNoException(gid, inData);
        if (ajOutData.getCode() == Ids.Ajf.Errors.成功.getId()) {
            F.log().i(String.format("接口名=%s_%s Code=%s", inData.getSourceProcessorId(),inData.getTargetProcessorId(),ajOutData.getCode()));
            return ajOutData;
        } else {
            throw new Exception(ajOutData.getMessage());
        }
    }

    /**
     * 调用AjFrame远程接口
     *
     * @param inData
     * @param getGidFromRequest
     * @return
     * @throws Exception
     */
    private static AJOutData callWait(AJInData inData, boolean getGidFromRequest) throws Exception {
        if (getGidFromRequest) {
//			return callWait(getGidFromAuthorization(), inData);
//			return callWait(getGidFromCookie(), inData);
            return callWait(getGidFromRequest(), inData);
        } else {
            return callWait(null, inData);
        }
    }

    /**
     * 从Request对象里取出Gid, 调用AjFrame远程接口
     *
     * @param inData
     * @return
     * @throws Exception
     */
    public static AJOutData callWait(AJInData inData) throws Exception {
        return callWait(inData, true);
    }


    /**
     * 调用远程接口，返回 无返回数据的Result对象
     *
     * @param inData
     * @return
     * @throws Exception
     */
    public static Result callWaitReturnOkResult(AJInData inData) throws Exception {
        callWait(inData, true);
        return Result.ok();
    }

    /**
     * 无Gid，调用AjFrame远程接口
     *
     * @param inData
     * @return
     * @throws Exception
     */
    public static AJOutData callWaitNoGid(AJInData inData) throws Exception {
        return callWait(inData, false);
    }

    /**
     * 调用远程接口，返回Result对象
     *
     * @param inData
     * @param cls
     * @param getGidFromRequest
     * @param <T>
     * @return
     * @throws Exception
     */
    private static <T extends AJFrameBean> Result callWaitReturnList(AJInData inData, Class<T> cls,
                                                                     boolean getGidFromRequest) throws Exception {
        AJOutData ajOutData = callWait(inData, getGidFromRequest);
        List<T> rtnInfoList = ajOutData.getDatas(cls);
        PagingInfo pagingInfo = ajOutData.getData(PagingInfo.class);
        Result result = Result.ok(rtnInfoList);
        result.put(Result.PAGE_TAG, pagingInfo);
        return result;
    }

    /**
     * 从Request获取Gid，调用远程接口，返回Result对象
     *
     * @param inData
     * @param cls
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T extends AJFrameBean> Result callWaitReturnList(AJInData inData, Class<T> cls) throws Exception {
        return callWaitReturnList(inData, cls, true);
    }

    /**
     * 无Gid，调用远程接口，返回Result对象
     *
     * @param inData
     * @param cls
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T extends AJFrameBean> Result callWaitNoGidReturnList(AJInData inData, Class<T> cls)
            throws Exception {
        return callWaitReturnList(inData, cls, false);
    }

    /**
     * 调用远程接口，返回AJFrameBean对象
     *
     * @param inData
     * @param cls
     * @param getGidFromRequest
     * @param <T>
     * @return
     * @throws Exception
     */
    private static <T extends AJFrameBean> T callWaitReturnBean(AJInData inData, Class<T> cls,
                                                                boolean getGidFromRequest) throws Exception {
        AJOutData ajOutData = callWait(inData, getGidFromRequest);
        return ajOutData.getData(cls);
    }

    /**
     * 调用远程接口，返回 带 返回数据的Result对象
     *
     * @param inData
     * @param cls
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T extends AJFrameBean> Result callWaitReturnResult(AJInData inData, Class<T> cls) throws Exception {
        return Result.ok(callWaitReturnBean(inData, cls, true));
    }

    /**
     * 从Request获取Gid，调用远程接口，返回AJFrameBean对象
     *
     * @param inData
     * @param cls
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T extends AJFrameBean> T callWaitReturnBean(AJInData inData, Class<T> cls) throws Exception {
        return callWaitReturnBean(inData, cls, true);
    }

    /**
     * 无Gid，调用远程接口，返回AJFrameBean对象
     *
     * @param inData
     * @param cls
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T extends AJFrameBean> T callWaitNoGidReturnBean(AJInData inData, Class<T> cls) throws Exception {
        return callWaitReturnBean(inData, cls, false);
    }

    /**
     * 从请求Cookie获取gid，没有的话再从Authorization获取
     *
     * @return
     * @throws Exception
     */
    private static String getGidFromRequest() throws Exception {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        Cookie[] cookies = request.getCookies();
        String gid = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (ProcessorCallerUtil.GidCookieName.equals(cookie.getName())) {
                    gid = cookie.getValue();
                    break;
                }
            }
        }
        F.log().d("从请求Cookie获取gid=" + gid);

        if (gid == null) {
            gid = request.getHeader(Authorization);
            F.log().d("从请求Header.Authorization获取gid=" + gid);
        }

        if (debug && gid == null) {
            gid = logingTest();
        }
        F.log().d("最后gid=" + gid);
        return gid;
    }

    /**
     * 从请求Header.Authorization获取gid
     *
     * @return
     * @throws Exception
     */
    private static String getGidFromAuthorization() throws Exception {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String gid = request.getHeader(Authorization);
        F.log().d("从请求Header.Authorization获取gid=" + gid);

        if (debug && gid == null) {
            gid = logingTest();
        }

        return gid;
    }

    /**
     * 从请求Cookie获取gid
     *
     * @return
     * @throws Exception
     */
    private static String getGidFromCookie() throws Exception {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Cookie[] cookies = request.getCookies();
        String gid = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (ProcessorCallerUtil.GidCookieName.equals(cookie.getName())) {
                    gid = cookie.getValue();
                    break;
                }
            }
        }
        F.log().d("从请求Cookie获取gid=" + gid);

        if (debug && gid == null) {
            gid = logingTest();
        }

        return gid;
    }

    /**
     * 包含登录的模拟调用方法
     */
    private static String logingTest() throws Exception {
        User user = new User(testUserName, new Md5Password(testUserPwd).toString());
        SessionDetails sd = new SessionDetails();
        sd.setCertSn("CSN:123456");
        sd.setDeviceSn(user.getUserName());
        sd.setMac("MAC:123456");
        sd.setOs("WINDOWS");
        sd.setVersion("junit");
        String procId = Ids.Um.DefaultProcessorIds.USMBC_用户登入.name();
        AJInData ajInData = new AJInData(procId, new Object[]{user, sd});
        AJOutData outData = ProcessorCallerUtil.callWait(null, ajInData);

        AJFrameSessionData sessionData = outData.getSessionData();
        return sessionData.getGid();
    }

}
