package com.example.justin.mg;

/**
 * Created by Justin on 1/29/2016.
 */
public class Purchase {
    private String business, date;
    private int id, amount;

    public Purchase(String business, String date, int amount, int id) {
        this.business = business;
        this.date = date;
        this.amount = amount;
        this.id = id;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
