package models;

import java.time.LocalDate;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 15:11 <br>
 * Project: webshop-back-end <br>
 */
public class Order {

    private int id;
    private Customer customerId;
    private LocalDate orderDate;
    public enum ORDERSTATUS{
        Beställd,
        Påbörjad,
        Levererad
    }
    ORDERSTATUS orderStatus;

    public Order(){}

    public Order(int id, Customer customerId, LocalDate orderDate, ORDERSTATUS orderStatus) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public ORDERSTATUS getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(ORDERSTATUS orderStatus) {
        this.orderStatus = orderStatus;
    }
}

