package io.codelex.notes.day06;

import io.codelex.notes.day05.SampleClass; // Importing Class from different package
import io.codelex.notes.day04.*; // Importing all Classes from package
import static java.lang.Math.PI; // Static import

public class Packages {
    public static void main(String[] args) {

        System.out.println(SampleClass.getCount()); // Using imported Class
        SampleClass myObject = new SampleClass("Packages are fun!");
        System.out.println(myObject);
        System.out.println(SampleClass.getCount());

        io.codelex.notes.day03.Main m = new io.codelex.notes.day03.Main(); // referencing by path to avoid conflict
        System.out.println(PI); // Using statically imported variable from different package/class
        
    }
}
