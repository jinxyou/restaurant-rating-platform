package com.example.demo.controller;


import com.example.demo.pojo.City;
import com.example.demo.service.cityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("city")
public class cityController {
    @Autowired
    private cityService cs;

    @RequestMapping("getCityAvg")
    public String getCityAvg(Model model){
        List<City> list = cs.getCityAvg();
        model.addAttribute("list", list);
        return "cityAvg";
    }

    @RequestMapping("getInRange")
    public String getInRange(Model model){
        List<City> list = cs.getCityInRange();
        model.addAttribute("list", list);
        return "cityInRange";
    }
}
