package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        int[] arrayOne = new int[10];

        Random random = new Random();
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(100) + 1;
        }

        int[] arrayTwo = Arrays.copyOf(arrayOne, arrayOne.length);

        arrayOne[arrayOne.length - 1] = -7;

        System.out.println("Array 1: " + arrayToString(arrayOne));
        System.out.println("Array 2: " + arrayToString(arrayTwo));

    }

    static String arrayToString(int[] array) {
        StringBuilder arrayAsString = new StringBuilder();
        for (int element : array) {
            arrayAsString.append(element);
            arrayAsString.append(" ");
        }
        return arrayAsString.toString().trim();
    }

}
