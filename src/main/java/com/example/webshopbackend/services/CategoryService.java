package com.example.webshopbackend.services;

import com.example.webshopbackend.models.Category;
import com.example.webshopbackend.models.Order;
import com.example.webshopbackend.repos.CategoryDAO;
import com.example.webshopbackend.repos.OrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ashkan Amiri
 * Date:  2021-04-12
 * Time:  17:28
 * Project: webshop-back-end
 * Copyright: MIT
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;


    public List<Category> getAllCategories() {
        return categoryDAO.findAll();
    }

    public void addCategory(Category category) {
        categoryDAO.save(category);
    }
}