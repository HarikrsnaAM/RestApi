package com.example.restapi_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Welcome to REST API development with Spring boot";
    }

    @GetMapping("/greet")
    public String greet(){
        return "greetings";
    }

    //getting value from url using path variable
    @GetMapping("greet/{name}")
    public String greetByName(@PathVariable  String name){
        return "welcome "+ name;
    }
}
