package com.aj.frame.auth.service.impl;


import com.aj.frame.beans.AJInData;
import com.aj.frame.beans.AJOutData;
import com.aj.frame.um.usm.beans.User;
import com.aj.frame.auth.IdStringToken;
import com.aj.frame.auth.common.util.ProcessorCallerUtil;
import com.aj.frame.auth.service.AuthorizationService;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    @Override
    public AJOutData getAppAndResourceAuth(App app, AppResource resource) throws Exception {
        String procId = IdStringToken.auth.DefaultProcessorIds.鉴权应用和资源.name();
        AJInData indata = new AJInData(procId, new Object[] { app, resource });
        AJOutData outdata = ProcessorCallerUtil.callWaitNoException(indata);
        return outdata;
    }

    @Override
    public AJOutData getUserAndAppAuth(App app, User user, UserExt userExt) throws Exception {
        String procId = IdStringToken.auth.DefaultProcessorIds.鉴权用户和应用.name();
        AJInData indata = new AJInData(procId, new Object[] { app, user, userExt });
        AJOutData outdata = ProcessorCallerUtil.callWaitNoException(indata);
        return outdata;
    }
}
