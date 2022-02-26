package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    // Write a Java program that reads a positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");
        String inputString = in.nextLine();

        // check if Long
        try {
            long n = Long.parseLong(inputString);

            // check if n is less than zero
            if (n < 0) {
                n *= -1;
            }

            if (n >= Long.parseLong("10000000000")) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else{
                int digits = String.valueOf(n).length();
                System.out.println("Number of digits in the number: " + digits);
            }
        } catch (NumberFormatException e){
            System.out.println("The number is not a long");
        }

    }

}
