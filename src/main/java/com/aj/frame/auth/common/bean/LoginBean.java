package com.aj.frame.auth.common.bean;

import com.aj.frame.um.usm.beans.SessionDetails;
import com.aj.frame.um.usm.beans.User;

/**
 * appLogin参数
 */
public class LoginBean {

    private User user;

    private SessionDetails sessionDetails;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SessionDetails getSessionDetails() {
        return sessionDetails;
    }

    public void setSessionDetails(SessionDetails sessionDetails) {
        this.sessionDetails = sessionDetails;
    }
}
