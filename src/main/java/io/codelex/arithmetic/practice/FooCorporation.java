package io.codelex.arithmetic.practice;

public class FooCorporation {
    public static void main(String[] args) {
        calculateTotalPay(7.50, 35);
        calculateTotalPay(8.20, 47);
        calculateTotalPay(10.00, 73);
    }

    public static void calculateTotalPay(double basePay, int hoursWorked) {
        if (basePay < 8.00) {
            System.out.println("Base pay too low!");
            return;
        }
        if (hoursWorked > 60) {
            System.out.println("Working too much!");
            return;
        }
        double totalPay = 0;
        if (hoursWorked > 40) {
            totalPay += (hoursWorked - 40) * basePay * 1.5;
            hoursWorked = 40;
        }
        totalPay += hoursWorked * basePay;
        System.out.println("Total pay: " + totalPay);
    }
}
