package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {

        System.out.println("Welcome to Piglet!");

        Scanner in = new Scanner(System.in);
        Random dice = new Random();

        int points = 0;
        roll: while (true) {
            int diceRoll = dice.nextInt(1,7);
            System.out.printf("You rolled a %d!\n", diceRoll);
            if (diceRoll == 1) {
                points = 0;
                break;
            }
            points += diceRoll;

            System.out.print("Roll again? ");
            char choice;
            while (true) {
                choice = in.next().toUpperCase().charAt(0);
                if (choice == 'Y' || choice == 'T') {
                    continue roll;
                } else if (choice == 'N' || choice == 'F') {
                    break roll;
                } else {
                    System.out.print("It's a Yes or No question: ");
                }
            }
        }

        System.out.printf("You got %d points.", points);

    }
}
