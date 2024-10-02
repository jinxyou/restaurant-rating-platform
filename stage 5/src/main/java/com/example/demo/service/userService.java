package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface userService {
    public List<User> queryAll();
    public void removeByUsername(String username);

    public void addUser(User user);

    public User Login(String Username);

    public void changePassword(User user);

}
