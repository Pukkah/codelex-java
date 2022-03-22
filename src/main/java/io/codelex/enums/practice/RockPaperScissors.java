package io.codelex.enums.practice;

import io.codelex.enums.practice.roshambo.Hand;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int trialsCount = 0;
        int playerWinCount = 0;
        int computerWinCount = 0;

        System.out.println("Let us begin...");

        while (true) {
            System.out.println("Rock-Paper-Scissors");
            Hand playerHand = getValidInput();
            if (playerHand == null) {
                break;
            }
            trialsCount++;
            Hand computerHand = Hand.random();
            System.out.println("\tMy turn: " + computerHand.name());
            switch (playerHand.vs(computerHand)) {
                case WINNER -> {
                    playerWinCount++;
                    System.out.println("\tYou won!\n");
                }
                case LOSER -> {
                    computerWinCount++;
                    System.out.println('\t' + computerHand.getDescription() + ", I won!\n");
                }
                case DRAW -> System.out.println("\tTie!\n");
            }
        }
        double playerWinPercent = calculatePercent(playerWinCount, trialsCount);
        double computerWinPercent = calculatePercent(computerWinCount, trialsCount);
        System.out.println("Number of trials: " + trialsCount);
        System.out.printf("I won %d(%.2f%%). You won %d(%.2f%%).%n", computerWinCount, computerWinPercent, playerWinCount, playerWinPercent);
        System.out.println("Bye!");
    }

    private static String getInputHint() {
        StringBuilder output = new StringBuilder();
        output.append("Enter ");
        for (Hand hand : Hand.values()) {
            output.append(hand.getAbbr())
                  .append(" for ")
                  .append(hand.name().toLowerCase())
                  .append(", ");
        }
        output.append("q to quit");
        return output.toString();
    }

    private static Hand getValidInput() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.printf("\tYour turn (%s): ", getInputHint());
            char c = in.nextLine().toLowerCase().charAt(0);
            if (c == 'q') {
                return null;
            }
            Hand hand = Hand.getByAbbr(c);
            if (hand != null) {
                return hand;
            }
            System.out.println("\tInvalid input, try again...");
        }
    }

    private static double calculatePercent(int value, int total) {
        return value / (double) total * 100;
    }

}
