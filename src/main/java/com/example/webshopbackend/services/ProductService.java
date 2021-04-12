package com.example.webshopbackend.services;

import com.example.webshopbackend.models.Product;
import com.example.webshopbackend.repos.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-12 <br>
 * Time: 12:09 <br>
 * Project: webshop-back-end <br>
 */
@Service
public class ProductService {


    @Autowired
    private ProductDAO productDAO;
    public List<Product> getProductDB() {
      //  ProductDAO productDB = new ProductDAO();

        return productDAO.getAllProducts();
    }
}
