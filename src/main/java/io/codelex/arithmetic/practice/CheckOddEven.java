package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = in.nextInt();

        System.out.println(number % 2 == 0 ? "Even Number" : "Odd Number");

        System.out.println("bye!");

    }
}
