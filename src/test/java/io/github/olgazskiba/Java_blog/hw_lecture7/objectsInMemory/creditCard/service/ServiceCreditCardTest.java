package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.creditCard.service;

import io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.creditCard.bean.CreditCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ServiceCreditCardTest {

    CreditCard creditCard;
    ServiceCreditCard serviceCreditCard;

    @BeforeEach
    void setUp() {
        creditCard = new CreditCard(1234_5678_1234_5678L, 0000);
        serviceCreditCard = new ServiceCreditCard();
    }

    @Test
    void pinValidation() {
        serviceCreditCard.deposit(0, 1234, creditCard);
        boolean expected = false;
        boolean actual = creditCard.getPinCode() == 1234;
        assertEquals(expected, actual);
    }

    @Test
    void depositPositive() {
        creditCard.setLoanDebt(400);
        serviceCreditCard.deposit(600, 0000, creditCard);
        int expected = 200;
        int actual = (int) creditCard.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void depositNegative() {
        creditCard.setLoanDebt(800);
        serviceCreditCard.deposit(600, 0000, creditCard);
        int expected = 0;
        int actual = (int) creditCard.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void pinValidationWithdraw() {
        serviceCreditCard.withdraw(1234, 500, creditCard);
        boolean expected = false;
        boolean actual = creditCard.getPinCode() == 1234;
        assertEquals(expected, actual);
    }

    @Test
    void withdrawNegative() {
        creditCard.setLoanDebt(500);
        creditCard.setCreditLimit(1500);
        serviceCreditCard.withdraw(0000, 600, creditCard);
        int expected = 1100;
        int actual = creditCard.getLoanDebt();
        assertEquals(expected, actual);
    }

    @Test
    void withdrawPositive() {
        creditCard.setLoanDebt(500);
        creditCard.setCreditLimit(1500);
        serviceCreditCard.deposit(2500, 0000, creditCard);
        serviceCreditCard.withdraw(0000, 500, creditCard);
        int expected = 1500;
        int actual = (int) creditCard.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void withdrawLimitExceeded() {
        creditCard.setLoanDebt(500);
        creditCard.setCreditLimit(1500);
        serviceCreditCard.withdraw(0000, 1600, creditCard);
        int expected = 1100;
        int actual = creditCard.getLoanDebt();
        assertEquals(expected, actual);
    }
}