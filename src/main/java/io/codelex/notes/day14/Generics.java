package io.codelex.notes.day14;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        Liquid myLiquid = new Liquid();
        Milk myMilk = new Milk();
        printOut(myLiquid, myMilk);

        Bottle<Milk> myBottle = new Bottle<>(new Milk());
        myBottle.pourOutContents();

        Bottle<Liquid> stringInABottle = createBottleFrom(myMilk);
        stringInABottle.pourOutContents();

    }

    public static <T> void printOut(T someObject, T otherObject) {
        List<T> myList = new ArrayList<>();
        myList.add(someObject);
        myList.add(otherObject);
        myList.forEach(System.out::println);
    }

    public static <T extends Liquid> Bottle<T> createBottleFrom(T contents) {
        Bottle<T> newBottle = new Bottle<>(contents);
        return newBottle;
    }

}
