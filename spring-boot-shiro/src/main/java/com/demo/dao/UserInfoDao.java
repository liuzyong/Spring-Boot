package com.demo.dao;

import com.demo.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;

/**
 * @program: spring-boot-shiro
 * @description: UserInfoDao
 * @author: lau
 * @create: 2019-09-25 20:31
 **/
public interface UserInfoDao extends JpaRepository<UserInfo, Long> {
    UserInfo findByUsername(String username);
}
