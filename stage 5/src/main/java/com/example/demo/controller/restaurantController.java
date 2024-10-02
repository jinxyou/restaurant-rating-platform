package com.example.demo.controller;


import com.example.demo.pojo.Restaurant;
import com.example.demo.service.restaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("restaurant")
public class restaurantController {
    @Autowired
    private restaurantService rs;

    @RequestMapping("queryByState")
    public String queryByState(String state){
        return "redirect:/restaurant/getStateResult?state="+state;
    }

    @RequestMapping("getStateResult")
    public String getStateResult(Model model, String state){
        List<Restaurant> list = rs.queryByState(state);
        model.addAttribute("list", list);
        return "showRestaurant";
    }
}
