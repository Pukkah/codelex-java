package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Hangman
public class Exercise8 {

    public static void main(String[] args) {
        // Settings and Data
        final char LIFE_SYMBOL = '\u2665'; // ♥
        final String[] WORDS = {"one", "two", "three"};
        final int MAX_MISSES = 3;

        // init
        int seed = new Random().nextInt(WORDS.length);
        char[] word = new char[WORDS[seed].length()];
        char[] misses = new char[MAX_MISSES];
        Arrays.fill(misses, LIFE_SYMBOL);

        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {

            // print fancy line
            int fancyLineWidth = 9 + word.length * 2;
            for (int i = 0; i < fancyLineWidth; i++) {
                System.out.print(i % 2 == 0 ? '-' : '=');
            }
            System.out.println();

            // print word
            System.out.print("Word:  ");
            for (char ch : word) {
                System.out.print(" " + (ch != 0 ? ch : '_'));
            }
            System.out.println();

            // print Misses
            System.out.print("Misses: ");
            for (char ch : misses) {
                if (ch != 0) {
                    System.out.print(ch);
                } else {
                    System.out.print(LIFE_SYMBOL);
                }
            }
            System.out.println();

            // check if win
            if (Arrays.equals(word, WORDS[seed].toCharArray())) {
                System.out.println("You WIN!");
                break;
            }

            //check if lose
            if (misses[MAX_MISSES-1] != LIFE_SYMBOL) {
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
                    if (misses[i] == LIFE_SYMBOL || misses[i] == guess) {
                        misses[i] = guess;
                        Arrays.sort(misses);
                        break;
                    }
                }
            }

        }

    }
}
