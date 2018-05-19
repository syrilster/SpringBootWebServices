package com.springboot.rest.webservice.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Syril on 19-05-2018.
 */
@Component
public class UserDAOService {
    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new User(1, "Syril", new Date()));
        users.add(new User(2, "Sandeep", new Date()));
        users.add(new User(3, "Anju", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }
}
