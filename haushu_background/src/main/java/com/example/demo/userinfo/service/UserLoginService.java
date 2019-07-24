package com.example.demo.userinfo.service;

import com.example.demo.userinfo.pojo.User;

import java.util.List;

public interface UserLoginService {
    public User getUser(String username);
    public List<User> getAll();
}
