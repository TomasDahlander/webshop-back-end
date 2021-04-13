package com.example.webshopbackend.models;

import com.example.webshopbackend.repos.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 15:32 <br>
 * Project: webshop-back-end <br>
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "number")
    private String number;

    @ManyToOne
    private Address address;

    private Long addressID;

    @Column(name = "accountType")
    private int accountType;

    @Column(name = "status")
    private boolean status;


    public User(){}

    public User(String email, String password, String firstname, String lastname, String number, Long addressID, int accountType, boolean status) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
        this.addressID = addressID;
        this.accountType = accountType;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int isAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getAddressID() {
        return addressID;
    }

    public void setAddressID(Long addressID) {
        this.addressID = addressID;
    }

    public int getAccountType() {
        return accountType;
    }
}
