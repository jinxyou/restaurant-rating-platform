package com.example.demo.pojo;

public class Dish {
    private String name;

    private String restaurant;
    private int price;

    public Dish(String name, String restaurant, int price) {
        this.name = name;
        this.price = price;
        this.restaurant = restaurant;
    }

    public Dish() {
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
