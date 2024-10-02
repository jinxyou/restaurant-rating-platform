package com.example.demo.dao;

import com.example.demo.pojo.Dish;
import com.example.demo.pojo.Have;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface dishDao {
    public List<Dish> selectByRestaurant(String id);

    public void insertDish(Dish dish);


}
