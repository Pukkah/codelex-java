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

        while (true) {
            System.out.printf("'%s', choose your location (row, column): ", turn);
            Scanner input = new Scanner(in.nextLine());
            int row, col;
            try {
                row = input.nextInt();
                col = input.nextInt();
            } catch (NoSuchElementException e) {
                continue;
            }

            if (cellExists(row, col) && cellIsFree(row, col)) {
                BOARD[row][col] = turn;
                printBoard();
            } else {
                continue;
            }

            if (isWinner(turn)) {
                System.out.printf("Player '%s' Wins!", turn);
            } else if (isDraw()) {
                System.out.println("The game is a tie.");
            } else {
                changeTurn();
                continue;
            }
            break;
        }

    }

    private static void printBoard() {
        System.out.println();
        for (char[] row : BOARD) {
            for (char cell : row) {
                System.out.print(((cell != 0) ? cell : ".") + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void changeTurn() {
        turn = (turn == 'X') ? 'O' : 'X';
    }

    private static boolean cellExists(int row, int col) {
        return (row >= 0 && row < SIZE && col >= 0 && col < SIZE);
    }

    private static boolean cellIsFree(int row, int col) {
        return (BOARD[row][col] == 0);
    }

    private static boolean hasWinner() {
        return (isWinner('X') || isWinner('O'));
    }

    private static boolean isWinner(char player) {
        return (checkRows(player) || checkCols(player) || checkDiagonalLTR(player) || checkDiagonalRTL(player));
    }

    private static boolean checkRows(char player) {
        boolean canWin;
        for (char[] row : BOARD) {
            canWin = true;
            for (char cell : row) {
                if (cell != player) {
                    canWin = false;
                    break;
                }
            }
            if (canWin) { return true; }
        }
        return false;
    }

    private static boolean checkCols(char player) {
        boolean canWin;
        for (int i = 0; i < SIZE; i++) {
            canWin = true;
            for (int j = 0; j < SIZE; j++) {
                if (BOARD[j][i] != player) {
                    canWin = false;
                    break;
                }
            }
            if (canWin) { return true; }
        }
        return false;
    }

    private static boolean checkDiagonalLTR(char player) {
        for (int i = 0; i < SIZE; i++) {
            if (BOARD[i][i] != player) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDiagonalRTL(char player) {
        for (int i = 0; i < SIZE; i++) {
            if (BOARD[i][SIZE - i - 1] != player) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDraw() {
        for (char[] row : BOARD) {
            for (char cell : row) {
                if (cell == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
