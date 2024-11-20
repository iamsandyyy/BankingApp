package com.example.bank_project.service;

import com.example.bank_project.entity.Loan;

public interface LoanService {
    Loan applyForLoan(Loan loan);
    // Other methods for loan-related operations (e.g., approve, reject, etc.)
}