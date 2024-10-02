package com.example.demo.dao;

import java.util.List;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userDao {
    public List<User> selectAll();
    public void deleteByUsername(String username);

    public void insertUser(User user);

    public User getByUsername(String username);

    public void updatePassword(User user);
}
