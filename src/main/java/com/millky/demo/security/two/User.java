package com.millky.demo.security.two;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @Column(length = 32)
    private String username;

    @Column(nullable = false)
    private String password;

    private boolean enabled;

    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private Role role;
}