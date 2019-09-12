package com.demo.service.impl;

import com.demo.dao.UserRepository;
import com.demo.mode.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: Spring-Boot
 * @description: UserServiceImpl
 * @author: lau
 * @create: 2019-09-09 20:04
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUserList() {

        return userRepository.findAll();
    }

    @Override
    public User findUserById(long id) {

        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {

        userRepository.save(user);
    }

    @Override
    public void edit(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(long id) {

        userRepository.deleteById(id);
    }
}
