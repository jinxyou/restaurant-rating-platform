package com.example.demo.service;


import com.example.demo.dao.restaurantDao;
import com.example.demo.pojo.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class restaurantServiceImp implements restaurantService{
    @Autowired
    private restaurantDao rd;


    @Override
    public List<Restaurant> queryByState(String state) {

        return rd.selectByState(state);
    }
}
