package com.example.demo.pojo;

public class Restaurant {
    private String business_id;
    private String name;
    private String address;
    private String city;
    private String state;
    private int postal_code;
    private float latitude;
    private float longitude;
    private float stars;
    private String categories;

    public Restaurant(String business_id, String name, String address, String city, String state, int postal_code, float latitude, float longitude, float stars, String categories) {
        this.business_id = business_id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postal_code = postal_code;
        this.latitude = latitude;
        this.longitude = longitude;
        this.stars = stars;
        this.categories = categories;
    }

    public Restaurant() {
    }

    public String getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(String business_id) {
        this.business_id = business_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
}
