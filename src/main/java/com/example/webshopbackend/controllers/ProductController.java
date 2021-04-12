package com.example.webshopbackend.controllers;

import com.example.webshopbackend.models.Product;
import com.example.webshopbackend.repos.ProductDAO;
import com.example.webshopbackend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-12 <br>
 * Time: 11:55 <br>
 * Project: webshop-back-end <br>
 */
@RestController
@RequestMapping(value = "/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping("/getproducts")
    public List<Product> getAllProducts(){
        // ProductDAO productDB = new ProductDAO();
        return productService.getProductDB();
    }
}
