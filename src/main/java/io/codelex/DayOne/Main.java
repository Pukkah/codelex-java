package io.codelex.DayOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));

        System.out.print("Enter your name: ");
        String name = input.next();

        System.out.println("Good bye, " + name + "!\nSee You next time.");
    }
}
