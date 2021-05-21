package com.cj.study.Demo1;

import com.cj.study.bean.User;
import com.cj.study.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/21 10:09 上午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println(("----- selectAll method test ------"));
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void saveUser(){
        User user = new User();
        user.setName("张三");
        user.setAge(99);
        user.setEmail("111@qq.com");
        userMapper.insert(user);
    }
}
