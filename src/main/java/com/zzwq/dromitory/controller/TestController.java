package com.zzwq.dromitory.controller;

import com.zzwq.dromitory.entity.User;
import com.zzwq.dromitory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String lll(Map<String, Object> map) {
        map.put("login", "ppg用户登录");
        return "hello";
    }

/*    @RequestMapping("main")
    public String login(String name, String password, Map<String, Object> map, HttpSession session) {
        User user = userService.login(name);//查一个对象
        map.put("user", new User());//前端模版的需求  后台可以不用管
        if (user != null) {
            if (user.getPassword().equals(password)) {
                session.setAttribute("userdo", user);//用户登录  数据存入session 方便前台调用
                return "main";//跳转登陆主页 html
            }else {
                map.put("err", "账号或密码错误");
            }
        }else {
            map.put("err", "账号不存在");
        }
        return "hello";
    }*/
}



