package com.springboot.rest.webservice.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Syril on 19-05-2018.
 */
@RestController
public class UserResource {
    @Autowired
    private UserDAOService service;

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        return service.findOne(id);
    }
}
