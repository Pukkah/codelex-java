package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = in.nextInt();
        System.out.print("Enter second integer: ");
        int b = in.nextInt();

        boolean result = a == 15 || b == 15 || a + b == 15 || a - b == 15;
        System.out.println("Number 15 is involved - " + result);
    }
}
