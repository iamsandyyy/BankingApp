package com.example.bank_project.service;

import com.example.bank_project.entity.CreditCard;

import java.util.List;

public interface CreditCardService {
    CreditCard createCreditCard(CreditCard creditCard);
    CreditCard getCreditCardByNumber(String cardNumber);
    List<CreditCard> getCreditCardsByAccount(Long accountNumber);
    void deleteCreditCard(Long creditCardId);
}