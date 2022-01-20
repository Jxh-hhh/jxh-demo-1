package jxh.demo.controller.LR;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    @RequestMapping("/login")
    @ResponseBody
    public Map login(String username, String password){
        // response.setHeader("Access-Control-Allow-Origin", "*");// 部分浏览器需加
        Map <String, Integer> map = new HashMap<>();
        System.out.println(username);
        System.out.println(password);
        String u = "admin";
        String p = "admin";
        if( u.equals(username) && p.equals(password)){
            map.put("code",200);
        }else {
            map.put("code",-1);
        }
        System.out.println("111");
        return  map;
    }
}
