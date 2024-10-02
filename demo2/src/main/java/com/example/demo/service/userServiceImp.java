package com.example.demo.service;

import com.example.demo.dao.userDao;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class userServiceImp implements userService{
    @Autowired
    private userDao sd;
    @Override
    public List<User> queryAll(){
        return sd.selectAll();
    }

    @Override
    public void removeByUsername(String username) {
        try {
            sd.deleteByUsername(username);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addUser(User user) {
        try {
            sd.insertUser(user);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public User Login(String Username) {
        return sd.getByUsername(Username);
    }

    @Override
    public void changePassword(User user){
        try{
            sd.updatePassword(user);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
