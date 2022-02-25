package io.codelex.notes.day04;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        // Catching Exception
        String name = null;
        try {
            name.length();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }


        // Throwing Exception
        Scanner in = new Scanner(System.in);
        loop: while (true) {
            String userInput = in.nextLine();
            switch (userInput) {
                case "break":
                    break loop;
                case "error":
                    throw new RuntimeException("Throwing error!");
                default:
                    System.out.println(userInput);
            }
        }

    }
}
