package com.example.bank_project.controller;

import com.example.bank_project.entity.CreditCard;
import com.example.bank_project.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credit-cards")
public class CreditCardController {

    @Autowired
    private CreditCardService creditCardService;

    @PostMapping
    public ResponseEntity<CreditCard> createCreditCard(@RequestBody CreditCard creditCard) {
        CreditCard createdCard = creditCardService.createCreditCard(creditCard);
        return new ResponseEntity<>(createdCard, HttpStatus.CREATED);
    }

    @GetMapping("/{cardNumber}")
    public ResponseEntity<CreditCard> getCreditCardByNumber(@PathVariable String cardNumber) {
        CreditCard card = creditCardService.getCreditCardByNumber(cardNumber);
        return new ResponseEntity<>(card, HttpStatus.OK);
    }

    @GetMapping("/account/{accountNumber}")
    public ResponseEntity<List<CreditCard>> getCreditCardsByAccount(@PathVariable Long accountNumber) {
        List<CreditCard> cards = creditCardService.getCreditCardsByAccount(accountNumber);
        return new ResponseEntity<>(cards, HttpStatus.OK);
    }

    @DeleteMapping("/{cardId}")
    public ResponseEntity<Void> deleteCreditCard(@PathVariable Long cardId) {
        creditCardService.deleteCreditCard(cardId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}