package com.example.demo.userinfo.controller;

import com.example.demo.userinfo.pojo.User;
import com.example.demo.userinfo.service.UserLoginService;
import com.example.demo.userinfo.service.impl.UserLoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.util.List;
import java.util.Map;

@Controller
public class UserLoginController {
    private final UserLoginService loginService;

    @Autowired
    public UserLoginController(UserLoginService loginService) {
        this.loginService = loginService;
    }

   /* @RequestMapping(value = {"/", "/index", "/login"},
            method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/login");
        return mv;
    }*/

    //@RequestMapping(value = "/huasu/login", method = RequestMethod.POST)
    @RequestMapping(value = "/huasu/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody Map<String, Object> data) {
        String username = (String) data.get("username");
        String password = (String) data.get("password");
        System.out.println(username + " " + password);
        //System.out.printf("用户名" + username);
        //System.out.printf("用户密码" + password);
        User user = loginService.getUser(username);
        if (user != null && user.getPassword().equals(password)) {
            return "login success";
        }
        return "login fail";
    }
    @RequestMapping(value = "/huasu/table", method = RequestMethod.GET)
    @ResponseBody
    public String table(String data){
        return "nnn";
    }

}
