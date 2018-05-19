package com.springboot.rest.webservice.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Syril on 19-05-2018.
 */
@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World!!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World Bean :)");
    }

    //Using Path variable to print a message
    @GetMapping(path = "/hello-world/{name}")
    public HelloWorldBean helloWorldPathVariableBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
