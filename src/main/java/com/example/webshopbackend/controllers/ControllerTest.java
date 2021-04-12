package com.example.webshopbackend.controllers;

import com.example.webshopbackend.models.User;
import com.example.webshopbackend.models.Order;
import com.example.webshopbackend.models.OrderRow;
import com.example.webshopbackend.models.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.webshopbackend.repos.UserDAO;
import com.example.webshopbackend.repos.OrderDAO;
import com.example.webshopbackend.repos.OrderRowDAO;
import com.example.webshopbackend.repos.ProductDAO;

import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 17:49 <br>
 * Project: webshop-back-end <br>
 */
@RestController
public class ControllerTest {

    @RequestMapping("/getusers")
    public List<User> getAllUsers(){
        UserDAO customerDB = new UserDAO();
        return customerDB.getAllUsers();
    }

    @RequestMapping("/getorders")
    public List<Order> getAllOrders(){
        OrderDAO orderDB = new OrderDAO();
        return orderDB.getAllOrders();
    }

    @RequestMapping("/getorderrows")
    public List<OrderRow> getAllOrderRows(){
        OrderRowDAO orderRowDB = new OrderRowDAO();
        return orderRowDB.getAllOrderRows();
    }

    @RequestMapping("/getproducts")
    public List<Product> getAllProducts(){
        ProductDAO productDB = new ProductDAO();
        return productDB.getAllProducts();
    }
}
