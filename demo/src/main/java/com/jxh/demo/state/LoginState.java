package com.jxh.demo.state;

import java.util.HashMap;
import java.util.Map;

public enum LoginState {
    LOGIN_SUCCESS{
        @Override
        public Map<String, String> getMsg(){
            Map<String, String> m = new HashMap<>();
            m.put("status", "success");
            m.put("message", "登录成功");
            return m;
        }
    },
    USERNAME_ERROR{
        @Override
        public Map<String, String> getMsg(){
            Map<String, String> m = new HashMap<>();
            m.put("status", "fail");
            m.put("message", "用户名错误");
            return m;
        }
    },
    PASSWORD_ERROR{
        @Override
        public Map<String, String> getMsg(){
            Map<String, String> m = new HashMap<>();
            m.put("status", "fail");
            m.put("message", "密码错误");
            return m;
        }
    },
    LOGIN_EXIST{
        @Override
        public Map<String, String> getMsg(){
            Map<String, String> m = new HashMap<>();
            m.put("status", "fail");
            m.put("message", "已登录，请勿重新登陆");
            return m;
        }
    },
    LOGIN_FAIL{
        @Override
        public Map<String, String> getMsg(){
            Map<String, String> m = new HashMap<>();
            m.put("status", "fail");
            m.put("message", "登录失败");
            return m;
        }
    };

    public abstract Map<String, String> getMsg();
}
