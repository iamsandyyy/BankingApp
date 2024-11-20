package com.example.bank_project.controller;

import com.example.bank_project.entity.Transaction;
import com.example.bank_project.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{accountNumber}")
    public ResponseEntity<List<Transaction>> getTransactionHistory(@PathVariable Long accountNumber) {
        List<Transaction> transactions = accountService.getTransactionHistory(accountNumber);
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }
}