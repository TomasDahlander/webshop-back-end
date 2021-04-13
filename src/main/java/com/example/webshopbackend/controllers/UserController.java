package com.example.webshopbackend.controllers;

import com.example.webshopbackend.models.Address;
import com.example.webshopbackend.models.User;
import com.example.webshopbackend.repos.AddressRepository;
import com.example.webshopbackend.repos.UserRepository;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;
import java.awt.*;
import java.util.Optional;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-12 <br>
 * Time: 11:55 <br>
 * Project: webshop-back-end <br>
 */
@RestController
@RequestMapping(value = "/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private AddressRepository addressRepo;

    @GetMapping("/getAllUsers")
    public Iterable<User> getAllUsers(){
        return userRepo.findAll();
    }

    @GetMapping("/addAddress")
    public @ResponseBody String addAddress(@RequestParam String street,
                                           @RequestParam String zipcode,
                                           @RequestParam String city) {
        Address temp = new Address(street, zipcode, city);
        addressRepo.save(temp);
        return "Address tillagd!";
    }
    @Column(name = "street")
    private String street;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "city")
    private String city;

    @GetMapping("/getAllAddresses")
    public @ResponseBody Iterable<Address> getAllAdresses() {
        return addressRepo.findAll();
    }


    @PostMapping(value = "/addUser")
    public @ResponseBody String addUser(@RequestBody User user) {
        Optional<Address> addressTemp = addressRepo.findById(user.getAddressID());
        user.setAddress(addressTemp.get());

        userRepo.save(user);
        return "Användare tillagd!";
    }
}
