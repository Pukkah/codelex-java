package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Set<String> setOfNames = new HashSet<>();

        while (true) {
            System.out.print("Enter name: ");
            String input = in.nextLine();
            if (input.equals("")) {
                break;
            }
            setOfNames.add(input);
        }

        System.out.print("Unique name list contains:");
        for (String name : setOfNames) {
            System.out.print(' ' + name);
        }

    }

}
