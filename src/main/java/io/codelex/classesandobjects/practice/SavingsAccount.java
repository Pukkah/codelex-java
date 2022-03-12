package io.codelex.classesandobjects.practice;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class SavingsAccount {
    private BigDecimal balance;
    private BigDecimal interest;
    private BigDecimal deposited = new BigDecimal(0);
    private BigDecimal withdrawn = new BigDecimal(0);
    private BigDecimal interestEarned = new BigDecimal(0);

    public SavingsAccount(BigDecimal startingBalance, BigDecimal annualInterestRate) {
        balance = startingBalance;
        interest = annualInterestRate.divide(BigDecimal.valueOf(100))
                                     .divide(BigDecimal.valueOf(12.0), MathContext.DECIMAL32);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("How much money is in the account?: ");
        BigDecimal startingBalance = in.nextBigDecimal();

        System.out.print("Enter the annual interest rate: ");
        BigDecimal annualInterestRate = in.nextBigDecimal();

        SavingsAccount savings = new SavingsAccount(startingBalance, annualInterestRate);

        System.out.print("How long has the account been opened? ");
        int monthsOpen = in.nextInt();

        for (int i = 1; i <= monthsOpen; i++) {
            System.out.printf("Enter amount deposited for month %d: ", i);
            BigDecimal depositAmount = in.nextBigDecimal();
            savings.deposit(depositAmount);

            System.out.printf("Enter amount withdrawn for month %d: ", i);
            BigDecimal withdrawAmount = in.nextBigDecimal();
            savings.withdraw(withdrawAmount);

            savings.addInterest();
        }

        System.out.printf("Total deposited: $%,.2f%n", savings.getDeposited());
        System.out.printf("Total withdrawn: $%,.2f%n", savings.getWithdrawn());
        System.out.printf("Interest earned: $%,.2f%n", savings.getInterestEarned());
        System.out.printf("Ending balance: $%,.2f%n", savings.getBalance());

    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        deposited = deposited.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) > 0) {
            balance = balance.subtract(amount);
            withdrawn = withdrawn.add(amount);
        } else {
            System.out.printf("Unable to withdraw %.2f, not enough funds.%n", amount);
        }
    }

    public void addInterest() {
        BigDecimal interestAmount = balance.multiply(interest).setScale(2, RoundingMode.DOWN);
        balance = balance.add(interestAmount);
        interestEarned = interestEarned.add(interestAmount);
    }

    public BigDecimal getDeposited() {
        return deposited;
    }

    public BigDecimal getWithdrawn() {
        return withdrawn;
    }

    public BigDecimal getInterestEarned() {
        return interestEarned;
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
