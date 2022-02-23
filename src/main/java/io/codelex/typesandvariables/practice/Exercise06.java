package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a series of digits:");
        String[] input = in.nextLine().split("");

        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += Integer.parseInt(input[i]);
        }

        System.out.println("Sum of all digits: " + sum);

    }
}
