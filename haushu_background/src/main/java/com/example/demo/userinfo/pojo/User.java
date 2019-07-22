package com.example.demo.userinfo.pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;


//@Alias(value="_usr")
public class User implements Serializable {
    private static final long serialVersionUID = -6147483707548636873L;
    //id
    private long eid;
    //用户名
    private String usr;
    //密码
    private String pass;

    public User(){
    }

    public User(String username, String password) {
        this.usr = username;
        this.pass = password;
    }

    public long getId() { return eid; }

    public void setId(long id) { this.eid = id; }

    public String getUsername() {
        return usr;
    }

    public void setUsername(String username) {
        this.usr = username;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }

    @Override
    public String toString() {
        return "User[" +
                "id=" + eid +
                ", username='" + usr + '\'' +
                ", password='" + pass + '\'' +
                ']';
    }
}
