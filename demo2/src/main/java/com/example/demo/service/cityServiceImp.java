package com.example.demo.service;

import com.example.demo.dao.cityDao;
import com.example.demo.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class cityServiceImp implements cityService{
    @Autowired
    private cityDao cd;

    @Override
    public List<City> getCityAvg() {
        return cd.cityAvg();
    }

    @Override
    public List<City> getCityInRange() {
        return cd.cityInRange();
    }
}
