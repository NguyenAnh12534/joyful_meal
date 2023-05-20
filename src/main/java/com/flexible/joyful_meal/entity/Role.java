package com.flexible.joyful_meal.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "roles")
public class Role {

    @Id
    private int role_id;

    private String roleName;
}
