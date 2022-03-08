package io.codelex.notes.day08;

public class Varargs {

    public static void main(String[] args) {

        giveMeVarargs("Single");
        giveMeVarargs("Hello", "World");
        giveMeVarargs("well", "this", "can", "go", "on", "forever");

    }

    public static void giveMeVarargs(String... words) {
        for (String word : words) {
            System.out.print(word +" ");
        }
        System.out.println();
    }

}
