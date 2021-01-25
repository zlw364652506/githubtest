package com.aj.frame.auth.service;

import com.aj.frame.beans.AJOutData;
import com.aj.frame.um.usm.beans.User;

public interface AuthorizationService {

    AJOutData getAppAndResourceAuth(App app, AppResource resource) throws Exception;

    AJOutData getUserAndAppAuth(App app, User user, UserExt userExt) throws Exception;
}
