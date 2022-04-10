package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        // add 5 values to Set.
        mySet.add("Red");
        mySet.add("Black");
        mySet.add("Yellow");
        mySet.add("Cyan");
        mySet.add("Magenta");

        System.out.println("Should have 5 elements: " + mySet); //Pay attention on order!

        // iterate through all elements in set
        for (String element : mySet) {
            System.out.println(element);
        }

        // remove all values from set
        mySet.clear();
        System.out.println("Should be empty: " + mySet);

        // check if it is possible to add duplicated values
        // huh?
        mySet.add("Green");
        mySet.add("Orange");
        mySet.add("Green");
        mySet.add("Purple");

        System.out.println(mySet);
    }

}
