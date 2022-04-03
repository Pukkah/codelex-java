package io.codelex.notes.day19.bankcards;

import java.math.BigDecimal;

public class DebitCard extends Card {
    private static final BigDecimal TOO_MUCH_MARGIN = BigDecimal.valueOf(10_000);

    public DebitCard(int number, String owner, String ccv, BigDecimal balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void deposit(BigDecimal amount) {
        if (balance.add(amount).compareTo(TOO_MUCH_MARGIN) > 0) {
            System.out.println("Warning: Too much money");
        }
        super.deposit(amount);
    }

}
