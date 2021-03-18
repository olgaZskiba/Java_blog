package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.creditCard.service;

/*
Методы
Зачисление средств на карту ("deposit")
Снятие средств с карты ("withdraw")

Требования к снятию средств:

При снятии средств с карты необходимо указывать пин-код и желаемую сумму;
Если пин-коды не совпадают, операция по снятию денег должна быть отклонена;
Деньги снимаются с карточного баланса. В случае, если их не хватает,
остаток суммы нужно брать за счет задолженности по кредиту;
Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена;
Требования к зачислению средств:

При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
В первую очередь зачисление покрывает задолженность по кредиту;
Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;
 */

import io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.creditCard.bean.CreditCard;
import org.apache.log4j.Logger;

public class ServiceCreditCard {

    Logger log = Logger.getLogger(ServiceCreditCard.class);


    public void deposit(int cash, int pinCode, CreditCard creditCard) {
        if (creditCard.getPinCode() == pinCode) {
            if (creditCard.getLoanDebt() > 0) {
                creditCard.setLoanDebt(cash - creditCard.getLoanDebt());
                if (creditCard.getLoanDebt() < 0) {
                    creditCard.setLoanDebt(Math.abs(creditCard.getLoanDebt()));
                    log.info("Balance = " + creditCard.getBalance() + ", Loan Debt = " + creditCard.getLoanDebt());
                } else {
                    creditCard.setBalance(creditCard.getLoanDebt());
                    creditCard.setLoanDebt(0);
                    log.info("Balance = " + creditCard.getBalance() + ", Loan Debt = " + creditCard.getLoanDebt());
                }
            } else {
                creditCard.setBalance(creditCard.getBalance() + cash);
                log.info("Balance = " + creditCard.getBalance() + ", Loan Debt = " + creditCard.getLoanDebt());
            }
        } else
            log.info("PIN is invalid");
        return;
    }

    public void withdraw(int pinCode, int cashWithdraw, CreditCard creditCard) {
        if (creditCard.getPinCode() == pinCode) {
            creditCard.setBalance(creditCard.getBalance() - cashWithdraw);
            if (creditCard.getBalance() < 0) {
                creditCard.setLoanDebt(creditCard.getLoanDebt() + ((int) Math.abs(creditCard.getBalance())));
                if (creditCard.getLoanDebt() > creditCard.getCreditLimit()) {
                    log.info("The amount exceeds the credit limit");
                    return;
                } else {
                    creditCard.setBalance(0);
                    log.info("Balance = " + creditCard.getBalance() + ", Loan Debt = " + creditCard.getLoanDebt());
                }
            } else {
                creditCard.setLoanDebt(0);
                log.info("Balance = " + creditCard.getBalance() + ", Loan Debt = " + creditCard.getLoanDebt());
            }
        } else
            log.info("PIN is invalid");
        return;
    }
}




