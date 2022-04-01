package io.codelex.notes.day19.bankcards;

import java.math.BigDecimal;

public class CreditCard extends Card {
    private static final BigDecimal LOW_FUNDS_MARGIN = BigDecimal.valueOf(100);

    public CreditCard(int number, String owner, String ccv, BigDecimal balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void withdraw(BigDecimal amount) throws NotEnoughFundsException {
        if (balance.subtract(amount).compareTo(LOW_FUNDS_MARGIN) < 0) {
            System.out.println("Warning: Low funds");
        }
        super.withdraw(amount);
    }

}
