package com.example.dailyexpense.model;

public class Expense {
    private String category;
    private double amount;
    private String date;
    private String imageUrl;

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Expense (){

    }

    public Expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }
    public Expense(String category, double amount, String date, String imageUrl) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
    public String getImageUrl() {
        return imageUrl;
    }
}
