package io.codelex.notes.day16;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {

        List<String> maybeNumbers = new ArrayList<>();
        maybeNumbers.add("3");
        maybeNumbers.add("6");
        maybeNumbers.add("9");
        maybeNumbers.add("2");

        maybeNumbers.stream()
                    .map(Integer::parseInt)
                    .filter(i -> i != 6)
                    .sorted()
                    .forEach(System.out::println);
    }

}
