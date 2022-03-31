package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Pattern quit = Pattern.compile("q.*", Pattern.CASE_INSENSITIVE);

        while (true) {
            System.out.print("Enter the numerator: ");
            int numerator;
            try {
                numerator = scanner.nextInt();
            } catch (InputMismatchException e) {
                if (scanner.hasNext(quit)) {
                    System.exit(1);
                }
                System.out.println("You entered bad data\n");
                continue;
            } finally {
                scanner.nextLine();
            }
            System.out.print("Enter the divisor: ");
            int divisor;
            try {
                divisor = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You entered bad data.\n");
                continue;
            } finally {
                scanner.nextLine();
            }
            try {
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor + '\n');
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by 0\n");
            }
        }
    }

}
