package com.hiep.model;

public class Product {
    private Long id;
    private String name;
    private int price;
    private int amount;
    private String info;

    public Product() {
    }

    public Product(Long id, String name, int price, int amount, String info) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

