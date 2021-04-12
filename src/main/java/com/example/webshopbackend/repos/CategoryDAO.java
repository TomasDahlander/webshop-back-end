package com.example.webshopbackend.repos;

import com.example.webshopbackend.models.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 15:56 <br>
 * Project: webshop-back-end <br>
 */
@Repository
public class CategoryDAO {

    public List<Category> getAllCategories(){
        List<Category> list = new ArrayList<>();
        list.add(new Category(1,"skafferi"));
        list.add(new Category(2,"snacks-godis"));
        list.add(new Category(3,"hem-städ"));
        return list;
    }

}

