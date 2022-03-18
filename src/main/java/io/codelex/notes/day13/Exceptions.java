package io.codelex.notes.day13;

public class Exceptions {
    public static void main(String[] args) {

        String maybeNumber = "ABC123";
        int result;

        try {
            result = Integer.parseInt(maybeNumber);
            System.out.println("Teksts bija skaitlis");
        } catch (NumberFormatException e) {
            System.out.println("Teksts nav skaitlis: " + e);
        }

    }

}
