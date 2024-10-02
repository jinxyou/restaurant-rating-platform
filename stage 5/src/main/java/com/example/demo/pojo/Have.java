package com.example.demo.pojo;

public class Have {
    private String name;

    private String restaurant;

    private int id;

    public Have() {
    }

    public Have(String name, String restaurant, int id) {
        this.name = name;
        this.restaurant = restaurant;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
