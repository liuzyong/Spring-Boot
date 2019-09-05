package com.lau.controller;

import com.lau.mapper.UserMapper;
import com.demo.user.User;
import com.demo.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/getuser")
    public String getUser(){

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userRepository.save(new User("bb11", "ba1a@126.com", "a1a1"));
        User user = userRepository.findByUserName("aa11");

        if (user != null){
            return user.toString();
        }
        return null;


    }

    @RequestMapping("/count")
    public String getCount(){

        Long count  = userRepository.countByUserName("aa");
        return count.toString();
    }

    @RequestMapping("/getall")
    public String getAll(){
        List<User> users = userMapper.getAll();
        System.out.println(users.toString());
        return users.toString();
    }

}
