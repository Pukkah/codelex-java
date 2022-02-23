package io.codelex.notes.day03;

public class Main {
    public static void main(String[] args) {

        // === CASTING ===
        int a = 23;
        long b = 32;

        //int c = a + b; // this does not work
        long d = a + b; // casting to the largest variable type


        // === CONTROL FLOW ===
        // if-else, switch...
        String expression = "test";
        switch (expression) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            default:
                System.out.println("default");
        }
        // new style
        switch (expression) {
            case "one" -> System.out.println("one");
            case "two" -> System.out.println("two");
            default -> System.out.println("default");
        }

        // === LOOPS ===
        // for, while, do while...

        // weird example using double
        for (double i = 0; i < 1.7; i += 0.1) {
            System.out.println(i); // we'll see some rounding errors
        }

        // iteration using for loop
        int[] numbers = {2, 4, 2, 5, 6, 8};
        for (int n : numbers) {
            System.out.print(n);
        }
        System.out.println();

        // do-while
        int doing = 0;
        do {
            System.out.println("doing");
            doing++;
        } while (doing < 3);

        // break; => pārtrauc ciklu
        // continue; => pārlec uz nākamo iterāciju




    }
}
