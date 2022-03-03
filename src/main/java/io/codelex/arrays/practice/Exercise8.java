package io.codelex.arrays.practice;

import java.util.Scanner;

// Hangman
public class Exercise8 {

    public static void main(String[] args) {
        final String[] WORDS = {"one", "two", "three"};
        final int MAX_MISSES = 3;

        int rand = (int) (WORDS.length * Math.random());
        char[] board = new char[WORDS[rand].length()];
        char[] misses = new char[MAX_MISSES];

        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {

            // print fancy line
            for (int i = 0; i < 9 + board.length * 2; i++) {
                System.out.print(i % 2 == 0 ? '-' : '=');
            }
            System.out.println();

            // print word
            System.out.print("Word:  ");
            for (char ch : board) {
                System.out.print(" " + (ch != 0 ? ch : "_"));
            }
            System.out.println();

            // print Misses
            System.out.print("Misses: ");
            for (char ch : misses) {
                if (ch != 0) {
                    System.out.print(ch);
                } else {
                    break;
                }
            }
            System.out.println();

            // check if win
            boolean win = true;
            for (char ch : board) {
                if (ch == 0) {
                    win = false;
                    break;
                }
            }
            if (win) {
                System.out.println("You WIN!");
                break;
            }

            //check if lose
            boolean lose = true;
            for (char ch : misses) {
                if (ch == 0) {
                    lose = false;
                    break;
                }
            }
            if (lose) {
                System.out.println("Answer: " + WORDS[rand]);
                System.out.println("You LOSE!");
                break;
            }

            // get input
            System.out.print("Guess:  ");
            char guess = in.nextLine().toLowerCase().charAt(0);

            // check if hit and place in board
            var hit = false;
            for (int i = 0; i < board.length; i++) {
                if (WORDS[rand].charAt(i) == guess) {
                    board[i] = guess;
                    hit = true;
                }
            }

            // add miss
            if (!hit) {
                for (int i = 0; i < MAX_MISSES; i++) {
                    if (misses[i] == 0) {
                        misses[i] = guess;
                        break;
                    }
                }
            }

        }

    }
}
