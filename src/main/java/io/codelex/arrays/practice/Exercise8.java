package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

// Hangman
public class Exercise8 {

    public static void main(String[] args) {
        // Settings and Data
        final String[] WORDS = {"one", "two", "three"};
        final int MAX_MISSES = 3;

        // init
        final int seed = (int) (WORDS.length * Math.random());
        char[] word = new char[WORDS[seed].length()];
        char[] misses = new char[MAX_MISSES];

        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {

            // print fancy line
            for (int i = 0; i < 9 + word.length * 2; i++) {
                System.out.print(i % 2 == 0 ? '-' : '=');
            }
            System.out.println();

            // print word
            System.out.print("Word:  ");
            for (char ch : word) {
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
            if (Arrays.equals(word, WORDS[seed].toCharArray())) {
                System.out.println("You WIN!");
                break;
            }

            //check if lose
            if (misses[MAX_MISSES-1] != 0) {
                System.out.println("Answer: " + WORDS[seed]);
                System.out.println("You LOSE!");
                break;
            }

            // get input
            System.out.print("Guess:  ");
            char guess = in.nextLine().toLowerCase().charAt(0);

            // check if hit and place in board
            var hit = false;
            for (int i = 0; i < word.length; i++) {
                if (WORDS[seed].charAt(i) == guess) {
                    word[i] = guess;
                    hit = true;
                }
            }

            // add miss
            if (!hit) {
                for (int i = 0; i < MAX_MISSES; i++) {
                    if (misses[i] == 0 || misses[i] == guess) {
                        misses[i] = guess;
                        break;
                    }
                }
            }

        }

    }
}
