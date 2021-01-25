package com.aj.frame.auth.service;


import com.aj.frame.um.usm.beans.User;

public interface DemoService {
    User getCurrentUser() throws Exception;
}
