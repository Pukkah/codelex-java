package io.codelex.notes.day17;

import java.util.Optional;
import java.util.Scanner;

public class Optionals {
    public static void main(String[] args) {
        Optional<Integer> maybeNumber = getUserInput();
        Integer result = maybeNumber.orElse(0) * 10;
        System.out.println(result);
    }

    public static Optional<Integer> getUserInput() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Integer number = null;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            //System.out.println(e);
        }
        return Optional.ofNullable(number);
    }

}
