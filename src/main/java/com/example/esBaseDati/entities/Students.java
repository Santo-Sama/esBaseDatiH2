package com.example.esBaseDati.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String lastName, firstName;

    @Column(nullable = false, unique = true)
    private String email;
}
