package com.example.demo.userinfo.service.impl;

import com.example.demo.userinfo.dao.UserDao;
import com.example.demo.userinfo.pojo.User;
import com.example.demo.userinfo.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {
    private final UserDao userDao;

    @Autowired
    public UserRegisterServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }


}










