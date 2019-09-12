package com.demo;

import com.demo.mapper.UserMapper;
import com.demo.mode.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
//import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectOne() {
        User user = userMapper.selectById(1L);
        System.out.println(user);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("微笑");
        user.setAge(3);
        user.setEmail("neo@tooool.org");
        assertThat(userMapper.insert(user), greaterThan(0));
        // 成功直接拿会写的 ID
//        assertThat(user.getId(),not(null));
        Assert.notNull(user.getId());
    }

    //
//    @Test
//    public void testDelete() {
//        assertThat(userMapper.deleteById(3L)).isGreaterThan(0);
//        assertThat(userMapper.delete(new QueryWrapper<User>()
//                .lambda().eq(User::getName, "smile"))).isGreaterThan(0);
//    }
//
//    @Test
//    public void testUpdate() {
//        User user = userMapper.selectById(2);
//        assertThat(user.getAge()).isEqualTo(36);
//        assertThat(user.getName()).isEqualTo("keep");
//
//        userMapper.update(
//                null,
//                Wrappers.<User>lambdaUpdate().set(User::getEmail, "123@123").eq(User::getId, 2)
//        );
//        assertThat(userMapper.selectById(2).getEmail()).isEqualTo("123@123");
//    }
//
    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
//
//    @Test
//    public void testPage() {
//        System.out.println("----- baseMapper 自带分页 ------");
//        Page<User> page = new Page<>(1, 2);
//        IPage<User> userIPage = userMapper.selectPage(page, new QueryWrapper<User>()
//                .gt("age", 6));
//        assertThat(page).isSameAs(userIPage);
//        System.out.println("总条数 ------> " + userIPage.getTotal());
//        System.out.println("当前页数 ------> " + userIPage.getCurrent());
//        System.out.println("当前每页显示数 ------> " + userIPage.getSize());
//        print(userIPage.getRecords());
//        System.out.println("----- baseMapper 自带分页 ------");
//    }
}