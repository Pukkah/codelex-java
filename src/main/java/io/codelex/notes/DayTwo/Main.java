package io.codelex.notes.DayTwo;

public class Main {
    public static void main(String[] args) {

        // Increment ++ and Decrement -- Operator as Prefix and Postfix
        int x = 10;
        x++;
        int y = ++x;
        int z = x++;

        System.out.println(y); // Expected: 12
        System.out.println(z); // Expected: 12

        boolean a = true;
        boolean b = false;

        boolean c = !(a && b); // THIS IS THE SAME
        boolean d = !a || !b; // AS THIS

    }
}
