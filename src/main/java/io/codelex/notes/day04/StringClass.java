package io.codelex.notes.day04;

public class StringClass {
    public static void main(String[] args) {

        // Strings are Immutable
        String firstString = "text";
        String firstSubstring = firstString.substring(1, 3);
        System.out.println(firstSubstring);

        // Comparing Strings
        String one = "test";
        String two = "test";
        String three = new String("test");

        System.out.println("one == two -> " + (one == two));
        System.out.println("two == three -> " + (two == three));
        System.out.println("two.equals(three) -> " + two.equals(three));

        // String Methods
        String originalString = "I am the Original String";
        String[] splittedString = originalString.split(" ");
        boolean containsOriginal = originalString.contains("Original");
        // ... and much much more....

    }
}
