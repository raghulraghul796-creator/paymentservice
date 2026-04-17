package com.payment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {
    PaymentValidator validator = new PaymentValidator();

    @Test
    void testValidPayment() {
        assertTrue(validator.validate(100.0, "1234567812345678"));
    }

    @Test
    void testInvalidAmount() {
        assertFalse(validator.validate(-50.0, "1234567812345678"));
    }
}
