package com.demo.service.impl;

import com.demo.model.UserInfo;
import com.demo.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoServiceImplTest {

    @Resource
    private UserInfoService userInfoService;

    @Test
    public void findByUsername() {
        UserInfo userInfo = userInfoService.findByUsername("admin");
    }
}