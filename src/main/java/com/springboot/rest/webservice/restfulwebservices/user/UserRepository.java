package com.springboot.rest.webservice.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Syril on 20-05-2018.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
