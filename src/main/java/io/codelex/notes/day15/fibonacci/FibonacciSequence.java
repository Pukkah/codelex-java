package io.codelex.notes.day15.fibonacci;

public class FibonacciSequence {

    public static int getNumber(int index) {
        if (index < 1) {
            throw new IllegalArgumentException();
        }
        if (index <= 2) {
            return index - 1;
        }
        return getNumber(index - 1) + getNumber(index - 2);
    }

}
