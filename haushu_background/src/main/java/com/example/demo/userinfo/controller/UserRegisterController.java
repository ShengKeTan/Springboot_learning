package com.example.demo.userinfo.controller;

import com.example.demo.userinfo.pojo.User;
import com.example.demo.userinfo.service.UserLoginService;
import com.example.demo.userinfo.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserRegisterController {
    private final UserRegisterService registerService;
    private final UserLoginService loginService;

    @Autowired
    public UserRegisterController(UserRegisterService registerService, UserLoginService loginService) {
        this.registerService = registerService;
        this.loginService = loginService;
    }

    //@RequestMapping(value = "/huasu/register", method = RequestMethod.GET)
    @RequestMapping(value = "/huasu/register",method = RequestMethod.GET)
    public String index() {
        return "user/register";
    }

    //@RequestMapping(value = "/register", method = RequestMethod.POST)
    @RequestMapping(value = "/huasu/register",method = RequestMethod.POST)
    @ResponseBody
    public String register(@RequestBody Map<String, Object> userMap) {
        if (userMap != null) {
            String username = (String) userMap.get("username");
            if (loginService.getUser(username) == null) {
                User user = new User();
                user.setUsername(username);
                user.setPassword((String) userMap.get("password"));
                int res = registerService.insertUser(user);
                if (res == 1) {
                    return "register success";
                } else {
                    return "register fail";
                }
            }
        }
            return "User info is null!";
    }
}
