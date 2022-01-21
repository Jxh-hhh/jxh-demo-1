package com.jxh.demo.controller;


import com.jxh.demo.entity.User;
import com.jxh.demo.service.UserService;
import com.jxh.demo.state.LoginState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jxh
 * @since 2022-01-21
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public Map<String, String> login(User user){
        return userService.login(user).getMsg();
    }

    @RequestMapping(value = "/register")
    public Map<String, String> register(User user) {
        return null;
        // todo
    }
}

