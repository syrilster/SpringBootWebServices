package com.springboot.rest.webservice.restfulwebservices.user;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Syril on 19-05-2018.
 */
@ToString(callSuper = false, exclude = "role")
@EqualsAndHashCode(callSuper = false, exclude = {"role"})
public class User {

    private Integer id;
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;
    private String role;
    @Past
    private Date birthDate;

    protected User() {
    }

    public User(Integer id, String name, Date birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
