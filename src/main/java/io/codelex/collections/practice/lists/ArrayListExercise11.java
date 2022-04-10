package io.codelex.collections.practice.lists;

import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        // Create an ArrayList with String elements
        List<String> theList = new ArrayList<>();

        // Add 10 values to list
        for (int i = 0; i < 10; i++) {
            theList.add(Month.values()[i].name());
        }

        //Add new value at 5th position
        theList.add(4, Month.NOVEMBER.name());

        // Change value at last position (Calculate last position programmatically)
        theList.set(theList.size() - 1, Month.DECEMBER.name());

        // Sort your list in alphabetical order
        Collections.sort(theList);

        // Check if your list contains "Foobar" element
        if (theList.contains("Foobar")) {
            System.out.println("Got some Foobar!");
        } else {
            System.out.println("No Foobar in sight!");
        }

        // Print each element of list using loop
        for (String element : theList) {
            System.out.println(element);
        }
    }

}
