package com.lau.mapper;

import com.demo.user.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "nickName", column = "nick_name", javaType = com.demo.user.User.class)
    })
    List<User> getAll();
}
