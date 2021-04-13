package com.example.webshopbackend.controllers;

import com.example.webshopbackend.models.Category;
import com.example.webshopbackend.models.Product;
import com.example.webshopbackend.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ashkan Amiri
 * Date:  2021-04-12
 * Time:  17:27
 * Project: webshop-back-end
 * Copyright: MIT
 */
@RestController
@CrossOrigin
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @GetMapping("/get")
    public List<Category> getAllCategory(){
        // ProductDAO productDB = new ProductDAO();
        return categoryService.getAllCategories();
    }

    @PostMapping("/add")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }
}