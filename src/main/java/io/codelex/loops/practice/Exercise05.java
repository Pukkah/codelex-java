package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = in.next();

        System.out.print("Enter second word: ");
        String secondWord = in.next();

        System.out.print(firstWord);
        for (int i = 0; i < 30 - (firstWord.length() + secondWord.length()); i++) {
            System.out.print('.');
        }
        System.out.print(secondWord);


    }
}
