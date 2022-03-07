package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        final int LINE_WIDTH = 30;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = in.next();

        System.out.print("Enter second word: ");
        String secondWord = in.next();

        int dotLeaderWidth = LINE_WIDTH - (firstWord.length() + secondWord.length());
        System.out.print(firstWord);
        for (int i = 0; i < dotLeaderWidth; i++) {
            System.out.print('.');
        }
        System.out.print(secondWord);

    }
}
