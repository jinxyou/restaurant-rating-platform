package com.example.demo.service;

import com.example.demo.dao.commentDao;
import com.example.demo.pojo.Comment;
import com.example.demo.pojo.Have;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class commentServiceImp implements commentService{

    @Autowired
    private commentDao cd;

    @Override
    public List<Comment> queryByDish(String name, String restaurant) {
        return cd.selectByDish(name, restaurant);
    }

    @Override
    public void addComment(Comment comment, Have have) {
        try {
            cd.insertComment(comment);
            int id = cd.getcurrId();
            have.setId(id);
            cd.createRelation(have);
            cd.storedProcedure();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
