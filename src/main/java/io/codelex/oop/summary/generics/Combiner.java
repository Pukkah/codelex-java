package io.codelex.oop.summary.generics;

import java.time.LocalDate;
import java.time.LocalTime;

public class Combiner {

    public static void main(String[] args) {
        LocalTime first = LocalTime.now();
        LocalDate second = LocalDate.now();
        System.out.println(combineTwoItems(first, second));
    }

    //Fix this method, so it can receive two any kind of objects
    //Test the functionality

    public static <S, T> String combineTwoItems(S first, T second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

}
