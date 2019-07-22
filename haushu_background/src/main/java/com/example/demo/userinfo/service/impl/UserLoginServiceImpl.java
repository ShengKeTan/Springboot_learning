package com.example.demo.userinfo.service.impl;

import com.example.demo.userinfo.dao.UserDao;
import com.example.demo.userinfo.pojo.User;
import com.example.demo.userinfo.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    private final UserDao userDao;

    @Autowired
    public UserLoginServiceImpl(UserDao userDao){this.userDao = userDao;}

    @Override
    @Transactional(
            isolation = Isolation.READ_COMMITTED,
            propagation = Propagation.REQUIRED
    )
    public User getUser(String username){
        return userDao.getUser(username);
    }
}
