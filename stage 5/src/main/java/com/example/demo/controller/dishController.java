package com.example.demo.controller;

import com.example.demo.pojo.Dish;
import com.example.demo.service.dishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static java.lang.Integer.parseInt;

@Controller
@RequestMapping("dish")
public class dishController {
    @Autowired
    private dishService ds;

    @RequestMapping("queryByRestaurant")
    public String queryByRestaurant(Model model, String id){
        List<Dish> list = ds.queryByRestaurant(id);
        model.addAttribute("list", list);
        model.addAttribute("business_id", id);
        return "showDish";
    }

    @RequestMapping("addDish")
    public String addDish(Model model,String id){
        model.addAttribute("id", id);
        return "addDish";
    }

    @RequestMapping("insertDish")
    public String insertDish(String restaurant, String name, String price){
        Dish dish = new Dish(name, restaurant, parseInt(price));
        try {
            ds.insertDish(dish);
            return "redirect:/dish/queryByRestaurant?id="+restaurant;
        }catch (Exception e){
            e.printStackTrace();
            return "add Dish error";
        }

    }
}
