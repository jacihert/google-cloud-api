package com.example.demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hello {
    @Id
    private int id;
    private String greeting;

    public int getId() {
        return id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
