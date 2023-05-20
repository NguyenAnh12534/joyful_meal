package com.flexible.joyful_meal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/all")
    public String getAll()
    {
        return "All users";
    }

}
