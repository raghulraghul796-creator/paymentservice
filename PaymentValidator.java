package com.payment;

public class PaymentValidator {
    public boolean validate(double amount, String cardNumber) {
        // Security: No negative or zero payments
        if (amount <= 0) return false;
        
        // Correctness: Basic card length check (16 digits)
        if (cardNumber == null || cardNumber.length() != 16) return false;
        
        return true;
    }
}
