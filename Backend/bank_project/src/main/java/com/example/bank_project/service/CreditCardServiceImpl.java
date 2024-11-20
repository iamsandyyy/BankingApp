package com.example.bank_project.service;

import com.example.bank_project.entity.CreditCard;
import com.example.bank_project.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    public CreditCard createCreditCard(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);
    }

    @Override
    public CreditCard getCreditCardByNumber(String cardNumber) {
        return creditCardRepository.findByCardNumber(cardNumber);
    }

    @Override
    public List<CreditCard> getCreditCardsByAccount(Long accountNumber) {
        return creditCardRepository.findByAccount_AccountNumber(accountNumber);
    }

    @Override
    public void deleteCreditCard(Long creditCardId) {
        creditCardRepository.deleteById(creditCardId);
    }
}