package com.example.bank_project.repository;

import com.example.bank_project.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
    CreditCard findByCardNumber(String cardNumber);
    List<CreditCard> findByAccount_AccountNumber(Long accountNumber);
}