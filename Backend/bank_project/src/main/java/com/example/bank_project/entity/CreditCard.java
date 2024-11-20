package com.example.bank_project.entity;

import jakarta.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String cardNumber;

    @Column
    private Double creditLimit;

    @Column
    private Double interestRate;

    @ManyToOne
    @JoinColumn(name = "account_number")
    private Account account;

    // Getters and setters
}