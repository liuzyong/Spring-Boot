package com.demo.mode;

import lombok.Data;

/**
 * @program: Spring-Boot
 * @description: User
 * @author: lau
 * @create: 2019-09-11 12:33
 **/

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

