package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        System.out.println("Welcome to the BMI calculator!");
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your weight in kg: ");
        int weightInKg = in.nextInt();
        double weightInLbs = weightInKg * 2.20462262;

        System.out.print("Please enter your height in cm: ");
        int heightInCm = in.nextInt();
        double heightInIn = heightInCm * 0.393700787;

        double bmi = weightInLbs * 703 / Math.pow(heightInIn, 2);
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi > 25) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You have optimal weight.");
        }
        System.out.println("Bye!");
    }
}
