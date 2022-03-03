package io.codelex.arrays.practice;

import java.util.NoSuchElementException;
import java.util.Scanner;

// Tic-Tac-Toe
public class Exercise7 {

    private static final int SIZE = 3;
    private static final char[][] BOARD = new char[SIZE][SIZE];
    private static char turn = Math.random() < 0.5 ? 'X' : 'O'; // Randomize 1st turn


    public static void main(String[] args) {

        System.out.println("Welcome to CEDELEX Java Tic-Tac-Toe");
        printBoard();

        Scanner in = new Scanner(System.in);

        // main gameplay loop
        while (true) {
            System.out.printf("'%s', choose your location (row, column): ", turn);
            Scanner rawIn = new Scanner(in.nextLine());
            int row, col;
            try {
                row = rawIn.nextInt();
                col = rawIn.nextInt();
            } catch (NoSuchElementException e) {
                continue;
            }
            // check if within bounds
            if (row < 0 || row > SIZE - 1 || col < 0 || col > SIZE - 1) continue;
            // check if cell is empty
            if (BOARD[row][col] != 0) continue;

            // place turn
            BOARD[row][col] = turn;
            printBoard();

            if (hasWinner()) {
                System.out.printf("Player '%s' Wins!", turn);
            } else if (isDraw()) {
                System.out.println("The game is a tie.");
            } else {
                nextTurn();
                continue;
            }
            break;
        }

    }


    private static void printBoard() {
        System.out.println();
        for (char[] row : BOARD) {
            for (char cell : row) {
                System.out.print((cell != 0 ? cell : ".") + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void nextTurn() {
        turn = turn == 'X' ? 'O' : 'X';
    }


    private static boolean hasWinner() {
        boolean canWin;
        // check rows
        for (char[] row : BOARD) {
            canWin = true;
            for (char cell : row) {
                if (cell != turn) {
                    canWin = false;
                    break;
                }
            }
            if (canWin) return true;
        }
        // check cols
        for (int i = 0; i < SIZE; i++) {
            canWin = true;
            for (int j = 0; j < SIZE; j++) {
                if (BOARD[j][i] != turn) {
                    canWin = false;
                    break;
                }
            }
            if (canWin) return true;
        }
        // check diagonal LTR
        canWin = true;
        for (int i = 0; i < SIZE; i++) {
            if (BOARD[i][i] != turn) {
                canWin = false;
                break;
            }
        }
        if (canWin) return true;

        // check diagonal RTL
        canWin = true;
        for (int i = 0; i < SIZE; i++) {
            if (BOARD[i][SIZE - i - 1] != turn) {
                canWin = false;
                break;
            }
        }
        return canWin;
    }


    private static boolean isDraw() {
        for (char[] row : BOARD) {
            for (char cell : row) {
                if (cell == 0) return false;
            }
        }
        return true;
    }

}
