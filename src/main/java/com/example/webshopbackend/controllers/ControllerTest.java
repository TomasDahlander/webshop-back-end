package com.example.webshopbackend.controllers;

import models.Customer;
import models.Order;
import models.OrderRow;
import models.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repos.CustomerDAO;
import repos.OrderDAO;
import repos.OrderRowDAO;
import repos.ProductDAO;

import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 17:49 <br>
 * Project: webshop-back-end <br>
 */
@RestController
public class ControllerTest {

    @RequestMapping("/getcustomers")
    public List<Customer> getAllCustomers(){
        CustomerDAO customerDB = new CustomerDAO();
        return customerDB.getAllCustomer();
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
