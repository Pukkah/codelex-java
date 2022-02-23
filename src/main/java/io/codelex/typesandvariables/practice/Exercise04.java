package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your year of birth:");
        short yearOfBirth = input.nextShort();

        System.out.printf("My name is %s and I was born in %s.", name, yearOfBirth);
    }
}