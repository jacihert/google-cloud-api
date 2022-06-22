package com.example.demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hello {
    @Id
    private int id;
    private String greeting;
}
