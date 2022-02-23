package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Write some text including Upper Case characters:");
        String input = in.nextLine();

        int upperCaseCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) upperCaseCount++;
        }

        System.out.println("Yor text has " + upperCaseCount + " Upper Case characters.");

    }
}
