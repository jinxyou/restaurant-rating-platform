package com.example.demo.service;
import com.example.demo.pojo.Comment;
import com.example.demo.pojo.Have;

import java.util.List;

public interface commentService {
    public List<Comment> queryByDish(String name, String restaurant);

    public void addComment(Comment comment, Have have);
}
