package com.example.demo.service;

import com.example.demo.pojo.Restaurant;

import java.util.List;

public interface restaurantService {
    public List<Restaurant> queryByState(String state);
}
