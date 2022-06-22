package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class HelloController {

    @Autowired
    HelloRepository repo;
    @GetMapping("/hello")
    public List<Hello> sayHello() {
        return repo.findAll();
    }

//    public String sayHello() {
//        return "Guten Tag. Wie geht es dir? Mein name ist Jacintha. ";
//    }
}
