package io.codelex.notes.day19.bankcards;

import java.math.BigDecimal;
import java.util.InputMismatchException;

abstract class Card {
    protected int number;
    protected String owner;
    protected String ccv;
    protected BigDecimal balance;

    public Card(int number, String owner, String ccv, BigDecimal balance) {
        this.number = number;
        this.owner = owner;
        if (!ccv.matches("^\\d\\d\\d$")) {
            throw new InputMismatchException("Check CCV!");
        }
        this.ccv = ccv;
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) throws NotEnoughFundsException {
        if (amount.compareTo(balance) > 0) {
            throw new NotEnoughFundsException();
        }
        balance = balance.subtract(amount);
    }

}
