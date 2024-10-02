package com.example.demo.service;

import com.example.demo.pojo.Dish;

import java.util.List;
public interface dishService {

    public List<Dish> queryByRestaurant(String id);

    public void insertDish(Dish dish);
}
