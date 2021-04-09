package repos;

import models.Customer;
import models.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 16:59 <br>
 * Project: webshop-back-end <br>
 */
public class OrderDAO {

    List<Customer> customers;

    public OrderDAO(){
        CustomerDAO customersDB = new CustomerDAO();
        customers = customersDB.getAllCustomer();
    }

    public List<Order> getAllOrders(){
        List<Order> list = new ArrayList<>();
        list.add(new Order(1, customers.get(0),LocalDate.parse("2014-03-12"), Order.ORDERSTATUS.Beställd));
        list.add(new Order(2, customers.get(1),LocalDate.parse("2018-01-01"), Order.ORDERSTATUS.Påbörjad));
        list.add(new Order(3, customers.get(2),LocalDate.parse("2020-05-30"), Order.ORDERSTATUS.Påbörjad));
        list.add(new Order(4, customers.get(3),LocalDate.parse("2020-02-20"), Order.ORDERSTATUS.Levererad));
        return list;
    }
}
