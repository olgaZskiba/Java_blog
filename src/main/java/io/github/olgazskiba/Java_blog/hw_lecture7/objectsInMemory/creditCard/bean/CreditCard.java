package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.creditCard.bean;

/*
Необходимо разработать класс "кредитная карта" CreditCard с учетом инкапсуляции,
которая обладает следующими характеристиками:
Свойства
Номер карты
Пин-код карты
Баланс
Кредитный лимит
Задолженность по кредиту
Методы
Зачисление средств на карту ("deposit")
Снятие средств с карты ("withdraw")
При создании карты нужно указывать ее номер и пинкод. Начальный баланс и задолженность по кредиту равны 0.
Кредитный лимит можно менять после создания карты.
 */

import java.util.Objects;

public class CreditCard {

    private long cardNumber;
    private int pinCode;
    private long balance;
    private int creditLimit;
    private int loanDebt;

    public CreditCard() {
    }

    public CreditCard(long cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public long getBalance() {
        return balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getLoanDebt() {
        return loanDebt;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setLoanDebt(int loanDebt) {
        this.loanDebt = loanDebt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNumber == that.cardNumber && pinCode == that.pinCode && balance == that.balance && creditLimit == that.creditLimit && loanDebt == that.loanDebt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, pinCode, balance, creditLimit, loanDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", pinCode=" + pinCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDebt=" + loanDebt +
                '}';
    }
}

