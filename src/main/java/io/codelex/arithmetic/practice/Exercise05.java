package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100 + 1);
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int guess = in.nextInt();
        if (guess < randomNumber) {
            System.out.printf("Sorry, you are too low.  I was thinking of %d.", randomNumber);
        } else if (guess > randomNumber) {
            System.out.printf("Sorry, you are too high.  I was thinking of %d.", randomNumber);
        } else {
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }
}
