package com.example.demo.service;

import com.example.demo.dao.dishDao;
import com.example.demo.pojo.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class dishServiceImp implements dishService{
    @Autowired
    private dishDao dd;

    @Override
    public List<Dish> queryByRestaurant(String id) {
        return dd.selectByRestaurant(id);
    }

    @Override
    public void insertDish(Dish dish) {
        try {
            dd.insertDish(dish);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
