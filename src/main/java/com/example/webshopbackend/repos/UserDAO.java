package com.example.webshopbackend.repos;

import com.example.webshopbackend.models.Address;
import com.example.webshopbackend.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 16:05 <br>
 * Project: webshop-back-end <br>
 */
public class UserDAO {

    private List<Address> addresses;

    public UserDAO(){
        AddressDAO cityDB = new AddressDAO();
        addresses = cityDB.getAllAddresses();
    }

    public List<User> getAllUsers(){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"hans.erik@gmail.com","123","Hans","Erik"
                ,"+46700000000",addresses.get(0),false,false));
        list.add(new User(2,"Inga.Månsson@outlook.com","123","Inga","Månsson"
                ,"+46732000770",addresses.get(1),false,false));
        list.add(new User(3,"Ellen.Berggren@outlook.com","123","Ellen","Berggren"
                ,"+46732000770",addresses.get(2),false,false));
        list.add(new User(4, "Ebba.Berggren@outlook.com","123","Ebba","Berggren"
                ,"+46732000770",addresses.get(3),false,false));
        list.add(new User(5,"Lovisa.Nyberg@outlook.com","123","Lovisa","Nyberg"
                ,"+46732000770",addresses.get(4),false,false));
        list.add(new User(6,"Matilda.Johnsson@outlook.com","123","Matilda","Johnsson"
                ,"+46732000770",addresses.get(5),false,false));
        list.add(new User(7,"Hakim@livs.com","123","Hakim","Hakim"
                ,"+46700000000",addresses.get(0),true,false));
        return list;
    }
}
