package com.jc4balos.inventory_system_jdbc.mapper;

public class User {
    public Integer userId;
    public String userName;
    public String passWord;

    public User(Integer userIdParam, String userNameParam, String passWordParam) {
        this.userId = userIdParam;
        this.userName = userNameParam;
        this.passWord = passWordParam;
    }
}
