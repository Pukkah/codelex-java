package io.codelex.classesandobjects.practice;

public class Account {
    private double balance;
    private String owner;

    public static void main(String[] args) {

        // Your first account
        Account firstAccount = new Account("Miks", 100.0);
        firstAccount.deposit(20.0);
        System.out.println(firstAccount);

        // Your first money transfer
        Account mattsAccount = new Account("Matt's account", 1000.0);
        Account myAccount = new Account("My Account", 0.0);
        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mattsAccount);
        System.out.println(myAccount);

        // Money transfers
        Account accountA = new Account("Account A", 100.0);
        Account accountB = new Account("Account B", 100.0);
        Account accountC = new Account("Account A", 100.0);
        Account.transfer(accountA, accountB, 50.0);
        Account.transfer(accountB, accountC, 25.0);
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);

    }

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }
}
