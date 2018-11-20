package com.zzwq.dromitory.controller;

import com.zzwq.dromitory.common.ServerResponse;
import com.zzwq.dromitory.entity.User;
import com.zzwq.dromitory.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("tosigin")
    public String tosigin(){
        return "hello";
    }
    @RequestMapping("main")
    public String mainmain(){
        return "main";
    }

    @ResponseBody
    @RequestMapping("sigin")
    public ServerResponse<User> sigin(User usero, HttpSession session){
        ServerResponse<User> user = loginService.login(usero.getName(), usero.getPassword());
        System.out.println(usero.getName());
        session.setAttribute("loginuser",user);
        return user;
    }
}
