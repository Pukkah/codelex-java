package io.codelex.notes.day08;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>();

        System.out.println("=== ADDING ELEMENTS ===");

        listOfNames.add("Miks");
        listOfNames.add("Zanda");
        listOfNames.add("Alise");

        for (String name : listOfNames) {
            System.out.println(name);
        }

        System.out.println("=== REMOVING ELEMENTS ===");

        listOfNames.remove("Zanda"); // by value
        listOfNames.remove(0); // by index

        for (String name : listOfNames) {
            System.out.println(name);
        }

    }

}
