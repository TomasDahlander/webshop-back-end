package com.example.webshopbackend.models;

import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 15:40 <br>
 * Project: webshop-back-end <br>
 */
public class Product {

    private int id;
    private String title;
    private String description;
    private double price;
    private double measurement;
    public enum UNIT{
        ml,
        cl,
        dl,
        l,
        g,
        kg
    }
    private UNIT unit;
    private String supplier;
    private String image;
    private int inStock;
    private boolean isFeatured;
    private List<Category> categories;

    public Product(){}

    public Product(int id, String title, String description, double price, String unit, String brand, String image, int quantity, boolean isFeatured, List<Category> categories) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.unit = unit;
        this.brand = brand;
        this.image = image;
        this.quantity = quantity;
        this.isFeatured = isFeatured;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public void setFeatured(boolean featured) {
        isFeatured = featured;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}




