package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int n = 10;
        int product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
