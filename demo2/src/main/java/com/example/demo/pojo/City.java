package com.example.demo.pojo;

public class City {
    private String Name;
    private int avgPrice;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(int avgPrice) {
        this.avgPrice = avgPrice;
    }

    public City(String name, int avgPrice) {
        Name = name;
        this.avgPrice = avgPrice;
    }

    public City() {
    }
}
