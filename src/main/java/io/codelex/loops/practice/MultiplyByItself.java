package io.codelex.loops.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger nMultiplyByItself = BigInteger.valueOf(n);
        for (int i = 0; i < n; i++) {
            nMultiplyByItself = nMultiplyByItself.multiply(BigInteger.valueOf(n));
            System.out.println(nMultiplyByItself);
        }

    }

}
