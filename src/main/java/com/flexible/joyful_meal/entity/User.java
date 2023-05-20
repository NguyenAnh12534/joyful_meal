package com.flexible.joyful_meal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(
        name = "users",
        uniqueConstraints = @
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private int userId;


    private String firstName;
    private String lastName;

    @Column(name = "phone")
    private String phoneNumber;

    @Column(name = "payment_qr")
    private String paymentQr;

    @Column(name = "avatar_url")
    private String avartar;


    private String email;
    private String password;

}
