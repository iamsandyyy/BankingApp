package com.example.bank_project.controller;

import com.example.bank_project.entity.Loan;
import com.example.bank_project.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public ResponseEntity<Loan> applyForLoan(@RequestBody Loan loan) {
        Loan appliedLoan = loanService.applyForLoan(loan);
        return new ResponseEntity<>(appliedLoan, HttpStatus.CREATED);
    }

    // Other endpoints for loan-related operations
}