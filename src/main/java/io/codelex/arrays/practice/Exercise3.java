package io.codelex.arrays.practice;

public class Exercise3 {

    // Java program to calculate the average value of array elements.
    public static void main(String[] args) {

        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        // calculate sum of all array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // calculate average value
        double average = (double) sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);

    }
}
