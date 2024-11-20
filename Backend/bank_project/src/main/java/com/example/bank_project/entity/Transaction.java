package com.example.bank_project.entity;

import jakarta.persistence.*;



import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "account_number")
    private Account account;

    @Column(nullable = false)
    private LocalDateTime transactionTime;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private String transactionType; // e.g., deposit, withdrawal, transfer

    // Getters and setters
}