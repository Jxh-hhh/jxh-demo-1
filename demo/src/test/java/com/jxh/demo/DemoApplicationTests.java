package com.jxh.demo;

import com.jxh.demo.entity.User;
import com.jxh.demo.service.UserService;
import com.jxh.demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {


    @Autowired
    UserService userService = new UserServiceImpl();

    @Test
    void contextLoads() {
        List<User> users = userService.list();
        users.forEach(System.out::println);
    }

}
