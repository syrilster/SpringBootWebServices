package com.springboot.rest.webservice.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Syril on 20-05-2018.
 */
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Integer id;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    //We do not need this to be displayed in the result.
    @JsonIgnore
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
