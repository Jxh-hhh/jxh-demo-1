package com.jxh.demo.service;

import com.jxh.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jxh.demo.state.LoginState;
import com.jxh.demo.state.RegisterState;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jxh
 * @since 2022-01-21
 */
public interface UserService extends IService<User> {
    LoginState login(User user);
    RegisterState register(User user);
}
