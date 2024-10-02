package com.example.demo.controller;

import com.example.demo.pojo.Comment;
import com.example.demo.pojo.Dish;
import com.example.demo.pojo.Have;
import com.example.demo.service.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static java.lang.Integer.parseInt;

@Controller
@RequestMapping("comment")
public class commentController {
    @Autowired
    private commentService cs;

    @RequestMapping("queryByDish")
    public String queryByDish(Model model, String name, String Restaurant){
        List<Comment> list = cs.queryByDish(name, Restaurant);
        model.addAttribute("list", list);
        model.addAttribute("name", name);
        model.addAttribute("restaurant", Restaurant);
        return "showComment";
    }

    @RequestMapping("addComment")
    public String addDish(Model model, String name, String restaurant){
        model.addAttribute("name", name);
        model.addAttribute("restaurant", restaurant);
        return "addComment";
    }


    @RequestMapping("insertComment")
    public String insertComment(String name, String restaurant, String text, String rate){
        Comment comment = new Comment(text, parseInt(rate));
        Have have = new Have(name, restaurant, -1);
        try {
            cs.addComment(comment, have);
            return "redirect:/comment/queryByDish?name="+name+"&Restaurant="+restaurant;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
}
