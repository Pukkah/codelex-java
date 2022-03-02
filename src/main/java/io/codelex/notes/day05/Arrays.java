package io.codelex.notes.day05;

public class Arrays {
    public static void main(String[] args) {

        int[] intArray = new int[3]; // New Empty Integer Array of size 3
        intArray[0] = 12; // Setting 1st element to 12
        intArray[2] = 32; // Setting 2nd element to 32
        // in intArray[3] = 49; // <== Error, as Index 3 is out of bounds

        String[][] stringArray = new String[3][4]; // New Empty 2D String Array with the size of 3x4
        char[][][] charArray = new char[6][6][6]; // New Empty 3D Character Array with a size of 6x6x6
        double[] doubleArray = {0.1, 0.2, 0.3}; // New 1D Double Array of size 3 and initialized values

        // === Array Iteration ===
        int[] sampleArray = {9, 6, 3};

        // regular for loop
        for (int i = 0; i< sampleArray.length; i++) {
            System.out.print(sampleArray[i]);
        }
        System.out.println(); // *newline*

        // enhanced for loop
        for (int n: sampleArray) {
            System.out.print(n);
        }



    }
}
