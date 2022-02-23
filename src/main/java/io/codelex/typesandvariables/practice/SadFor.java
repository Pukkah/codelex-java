package io.codelex.typesandvariables.practice;

public class SadFor {
    public static void main(String[] args) {
        System.out.println(test1());
    }

    public static int test1() {
        int i = 0;
        for (; i < 10; i++) {
            if (Math.sqrt(i) > 2.5) {
                break;
            }
        }
        return i;
    }
}
