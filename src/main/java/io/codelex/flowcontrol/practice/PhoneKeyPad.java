package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String: ");
        char[] inputAsChars = in.nextLine().toUpperCase().toCharArray();

        for (char iChar: inputAsChars) {
            switch (iChar) {
                case '1', '.', ',', '!', '?' -> System.out.print(1);
                case '2', 'A', 'B', 'C' -> System.out.print(2);
                case '3', 'D', 'E', 'F' -> System.out.print(3);
                case '4', 'G', 'H', 'I' -> System.out.print(4);
                case '5', 'J', 'K', 'L' -> System.out.print(5);
                case '6', 'M', 'N', '0' -> System.out.print(6);
                case '7', 'P', 'Q', 'R', 'S' -> System.out.print(7);
                case '8', 'T', 'U', 'V' -> System.out.print(8);
                case '9', 'W', 'X', 'Y', 'Z' -> System.out.print(9);
                default -> System.out.print(0); // Whitespace and Symbols
            }
        }

    }
}
