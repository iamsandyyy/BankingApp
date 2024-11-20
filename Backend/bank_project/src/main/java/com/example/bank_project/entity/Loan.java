package com.example.bank_project.entity;

import jakarta.persistence.*;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double loanAmount;

    @Column
    private Integer loanTerm;

    @Column
    private Double interestRate;

    @ManyToOne
    @JoinColumn(name = "account_number")
    private Account account;

    // Getters and setters
}