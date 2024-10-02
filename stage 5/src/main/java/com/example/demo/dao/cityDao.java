package com.example.demo.dao;


import com.example.demo.pojo.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface cityDao {
    public List<City> cityAvg();

    public List<City> cityInRange();
}
