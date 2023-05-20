package com.flexible.joyful_meal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    private int user_id;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String payment_qr;
    private String avartar;
    private String email;
    private String password;
}
