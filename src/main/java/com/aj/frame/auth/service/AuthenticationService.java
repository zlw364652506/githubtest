package com.aj.frame.auth.service;

import com.aj.frame.auth.api.beans.headers.Headers;
import com.aj.frame.beans.AJOutData;
import com.aj.frame.um.usm.beans.SessionDetails;
import com.aj.frame.um.usm.beans.User;
import org.springframework.web.server.ResponseStatusException;

/**
 * 认证
 */
public interface AuthenticationService {

    AJOutData appLogin(User user, SessionDetails sd) throws Exception;

    void checkSignature(String signatrue, String timestamp, String nonce) throws ResponseStatusException;

    void checkCode(String code) throws Exception;

    UserExt getUserByCode(String code) throws Exception;

    //验证用户权限
    OutData verifyUserAuthor(Headers headers )throws Exception;


}
