package com.jxh.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.jxh.demo.entity.User;
import com.jxh.demo.mapper.UserMapper;
import com.jxh.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxh.demo.state.LoginState;
import com.jxh.demo.state.RegisterState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jxh
 * @since 2022-01-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public LoginState login(User user) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.ge(User::getUsername, user.getUsername());
        User res = getOne(wrapper);
        if(res == null){
            return LoginState.USERNAME_ERROR;
        }
        if(res.equals(user.getPassword())){
            return LoginState.LOGIN_SUCCESS;
        } else{
            return LoginState.PASSWORD_ERROR;
        }
    }

    @Override
    public RegisterState register(User user) {
        // todo register
        return RegisterState.REGISTER_FAIL;
    }
}
