package com.demo.service;

import com.demo.model.UserInfo;

public interface UserInfoService {

    UserInfo findByUsername(String username);
}
