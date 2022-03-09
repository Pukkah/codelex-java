package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Hangman
public class Exercise8 {
    private static final String[] WORDS = { "one", "two", "three" };
    private static final int MAX_MISSES = 3;
    private static final char LIFE = '\u2665'; // ♥;

    private static final int SEED = new Random().nextInt(WORDS.length);
    private static final char[] WORD = WORDS[SEED].toCharArray();
    private static final char[] BOARD = new char[WORD.length];
    private static final char[] MISSES = new char[MAX_MISSES];

    public static void main(String[] args) {
        Arrays.fill(MISSES, LIFE);
        Scanner in = new Scanner(System.in);

        while (true) {
            printFancyLine();
            System.out.println("Word:   " + getBoard());
            System.out.println("Misses: " + String.valueOf(MISSES));

            if (isWinner()) {
                System.out.println("You WIN!");
                break;
            }

            if (isLoser()) {
                System.out.println("Answer: " + String.valueOf(WORD));
                System.out.println("You LOSE!");
                break;
            }

            System.out.print("Guess:  ");
            char guess = in.nextLine().toLowerCase().charAt(0);
            guessCharacter(guess);
        }
    }

    private static void guessCharacter(char guess) {
        var hit = false;
        for (int i = 0; i < BOARD.length; i++) {
            if (WORD[i] == guess) {
                BOARD[i] = guess;
                hit = true;
            }
        }
        if (!hit) { addMiss(guess); }
    }

    private static void addMiss(char character) {
        for (int i = 0; i < MAX_MISSES; i++) {
            if (MISSES[i] == LIFE || MISSES[i] == character) {
                MISSES[i] = character;
                Arrays.sort(MISSES);
                break;
            }
        }
    }

    private static boolean isWinner() {
        return Arrays.equals(BOARD, WORD);
    }

    private static boolean isLoser() {
        return MISSES[MAX_MISSES - 1] != LIFE;
    }

    private static void printFancyLine() {
        int width = 9 + WORD.length * 2;
        for (int i = 0; i < width; i++) {
            System.out.print((i % 2 == 0) ? '-' : '=');
        }
        System.out.println();
    }

    private static String getBoard() {
        StringBuilder boardString = new StringBuilder();
        for (char c : BOARD) {
            boardString.append(" ");
            boardString.append((c != 0) ? c : '_');
        }
        return boardString.substring(1);
    }

}
