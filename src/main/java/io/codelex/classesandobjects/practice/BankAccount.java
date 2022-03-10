package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.text.DecimalFormat;

public class BankAccount {

    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public static void main(String[] args) {

        // positive balance account
        BankAccount goodAccount = new BankAccount("Miks", 420.69);
        System.out.println(goodAccount);

        //negative balance account
        BankAccount badAccount = new BankAccount("Putins", -99999999);
        System.out.println(badAccount);

    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        DecimalFormat USDFormat = new DecimalFormat("$,###.00");
        String formattedBalance = USDFormat.format(balance);
        return String.format("%s, %s", name, formattedBalance);
    }

}
