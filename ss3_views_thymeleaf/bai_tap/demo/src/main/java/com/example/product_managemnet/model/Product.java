package com.example.product_managemnet.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String origin;  // xuất xứ
    private String expiry;  // hạn sử dụng

    public Product() {
    }

    public Product(int id, String name, double price, String origin, String expiry) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.origin = origin;
        this.expiry = expiry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
}
