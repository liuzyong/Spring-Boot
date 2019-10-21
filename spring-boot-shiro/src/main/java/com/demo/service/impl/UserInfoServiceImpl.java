package com.demo.service.impl;

import com.demo.dao.UserInfoDao;
import com.demo.model.UserInfo;
import com.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: Spring-Boot
 * @description: UserInfoServiceImpl
 * @author: lau
 * @create: 2019-09-27 11:59
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
