package com.jxh.demo.state;

import java.util.HashMap;
import java.util.Map;

public enum RegisterState {
    REGISTER_SUCCESS{
        @Override
        public Map<String, String> getMsg() {
            Map<String, String> m = new HashMap<>();
            m.put("status", "success");
            m.put("message", "注册成功");
            return m;
        }
    },
    USERNAME_EXIST {
        @Override
        public Map<String, String> getMsg() {
            Map<String, String> m = new HashMap<>();
            m.put("status", "fail");
            m.put("message", "用户名已存在");
            return m;
        }
    },
    REGISTER_FAIL {
        @Override
        public Map<String, String> getMsg() {
            Map<String, String> m = new HashMap<>();
            m.put("status", "fail");
            m.put("message", "注册失败");
            return m;
        }
    };

    public abstract Map<String, String> getMsg();
}
