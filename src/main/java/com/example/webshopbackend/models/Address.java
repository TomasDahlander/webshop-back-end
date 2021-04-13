package com.example.webshopbackend.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-12 <br>
 * Time: 11:53 <br>
 * Project: webshop-back-end <br>
 */
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "city")
    private String city;

    @OneToMany
    @JoinColumn(name = "ID")
    private List<User> user;

    public Address(){}

    public Address(String street, String zipcode, String city) {
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
