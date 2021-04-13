package com.example.webshopbackend.repos;

import com.example.webshopbackend.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByFirstname(String firstname);

}
