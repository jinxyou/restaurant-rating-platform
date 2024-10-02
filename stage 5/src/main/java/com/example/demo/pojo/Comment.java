package com.example.demo.pojo;

public class Comment {
    private String text;
    private int rate;

    public Comment(String text, int rate) {
        this.text = text;
        this.rate = rate;
    }

    public Comment() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }


}
