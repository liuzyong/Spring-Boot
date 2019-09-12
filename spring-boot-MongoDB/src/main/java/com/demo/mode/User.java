package com.demo.mode;

import java.io.Serializable;

/**
 * @program: Spring-Boot
 * @description: User
 * @author: lau
 * @create: 2019-09-10 15:42
 **/

public class User implements Serializable {

    private static final long serialVersionUID = -3258839839160856613L;
    private Long id;
    private String userName;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    private String passWord;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
