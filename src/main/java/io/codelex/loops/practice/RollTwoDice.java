package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Desired sum: ");
        int desiredSum = in.nextInt();
        if (desiredSum > 12 || desiredSum < 2) {
            throw new RuntimeException("Unable to roll " + desiredSum);
        }

        Random rand = new Random();
        int rollSum;
        do {
            int rollA = rand.nextInt(6) + 1;
            int rollB = rand.nextInt(6) + 1;
            rollSum = rollA + rollB;
            System.out.printf("%d and %d = %d\n", rollA, rollB, rollSum);
        } while (rollSum != desiredSum);

    }

}
