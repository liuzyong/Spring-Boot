package com.demo.repository;

import com.demo.mode.User;

/**
 * @program: Spring-Boot
 * @description: UesrRepository
 * @author: lau
 * @create: 2019-09-10 15:47
 **/
public interface UserRepository {
    void saveUser(User user);

    User findUserByUserName(String strName);
}
