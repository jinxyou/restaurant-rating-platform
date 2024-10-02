package com.example.demo.dao;
import com.example.demo.pojo.Restaurant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface restaurantDao {
    public List<Restaurant> selectByState(String state);
}
