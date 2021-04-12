package com.example.webshopbackend.models;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-12 <br>
 * Time: 10:06 <br>
 * Project: webshop-back-end <br>
 */
public class Address {
    
    private int id;
    private String street;
    private String zipCode;
    private String city;

    public Address(){}

    public Address(int id, String street, String zipCode, String city) {
        this.id = id;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}