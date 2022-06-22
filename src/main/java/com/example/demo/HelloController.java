package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Guten Tag. Wie geht es dir? Mein name ist Jacintha. ";
    }
}
