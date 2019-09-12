package com.demo.controller;

import com.demo.mode.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: Spring-Boot
 * @description: UserController
 * @author: lau
 * @create: 2019-09-09 19:55
 **/
@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/userAdd";
    }

//    @RequestMapping("/user/userAdd")
//    public String userAdd(User user){
//        userService.save(user);
//        return "redirect:/list";
//    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<User> users=userService.getUserList();
        model.addAttribute("users", users);
        return "user/list";
    }


    @RequestMapping("/add")
    public String add(User user) {
        userService.save(user);
        return "redirect:/list";
    }
}
