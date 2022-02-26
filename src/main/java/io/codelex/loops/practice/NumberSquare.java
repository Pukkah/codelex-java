package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Min? ");
        int min = in.nextInt();
        System.out.print("Max? ");
        int max = in.nextInt();

        for (int i = 0; i <= max - min; i++) {
            for (int j = min; j <= max; j++) {
                System.out.print(i+j > max ? i+j-(max-min+1) : i+j);
            }
            System.out.println();
        }

    }
}
