package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise3 {

    // Write a Java program to insert an element into the array list at the first position.
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);

        // Add new color at the first and third position of the list
        colors.add(0, "Cyan");
        colors.add(2, "Magenta");

        //Print the list
        System.out.println(colors);
    }

}
