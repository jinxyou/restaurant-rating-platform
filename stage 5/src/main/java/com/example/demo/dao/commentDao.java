package com.example.demo.dao;

import com.example.demo.pojo.Comment;
import com.example.demo.pojo.Have;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface commentDao {
    public List<Comment> selectByDish(String name, String Restaurant);

    public void insertComment(Comment comment);

    public int getcurrId();

    public void createRelation(Have have);

    public void storedProcedure();
}
