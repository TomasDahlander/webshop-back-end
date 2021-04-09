package repos;

import models.City;
import models.Customer;
import models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 16:05 <br>
 * Project: webshop-back-end <br>
 */
public class CustomerDAO {

//    (int id, User userId, String firstname, String lastname,
//    String phoneNr, String streetAddress, City zipCode)

    private List<User> users;
    private List<City> cities;

    public CustomerDAO(){
        UserDAO userDB = new UserDAO();
        CityDAO cityDB = new CityDAO();
        users = userDB.getAllUsers();
        cities = cityDB.getAllCities();
    }

    public List<Customer> getAllCustomer(){
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1,users.get(1),"Hans","Erik"
                ,"+46700000000","Stjärnvägen 20",cities.get(0)));
        list.add(new Customer(2,users.get(2),"Inga","Månsson"
                ,"+46732000770","Torggatan 33", cities.get(1)));
        list.add(new Customer(3, users.get(3),"Ellen","Berggren"
                ,"+46732000770","Stigen 34",cities.get(2)));
        list.add(new Customer(4, users.get(4),"Ebba","Berggren"
                ,"+46732000770","Vasastan 53",cities.get(3)));
        list.add(new Customer(5, users.get(5),"Lovisa","Nyberg"
                ,"+46732000770","Torget 35",cities.get(4)));
        list.add(new Customer(6, users.get(6),"Matilda","Johnsson"
                ,"+46732000770","Torget 36",cities.get(5)));
        return list;
    }

}

