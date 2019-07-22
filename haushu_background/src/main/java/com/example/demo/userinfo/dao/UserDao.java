package com.example.demo.userinfo.dao;

import com.example.demo.userinfo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

@Repository
@Mapper
public interface UserDao {
    public User getUser(String username);
    public int insertUser(User user);
}
