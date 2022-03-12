package io.codelex.notes.day10;

import java.util.Random;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        String password = "kartupelis";

        while (true) {
            String inputPassword = input.nextLine();

            long startTime = System.currentTimeMillis();
            boolean correct = equals(inputPassword, password);
            System.out.println(correct);
            long endTime = System.currentTimeMillis();

            System.out.println(endTime - startTime);

            if (correct) {
                System.exit(1);
            }
        }

    }

    public static boolean equals(String value, String other) throws InterruptedException {
        Random rand = new Random();
        Thread.sleep(rand.nextInt(0, 500));
        if (value.length() == other.length()) {
            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) != other.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
