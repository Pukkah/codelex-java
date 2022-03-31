package io.codelex.oop.summary.generics;

import java.time.LocalDate;
import java.util.Currency;

public class Printer<T> {
    public static void main(String[] args) {
        LocalDate thingOne = LocalDate.now();
        Currency thingTwo = Currency.getInstance("EUR");

        Printer<LocalDate> priterOne = new Printer<>(thingOne);
        priterOne.print();

        Printer<Currency> printerTwo = new Printer<>(thingTwo);
        printerTwo.print();
    }

    //Fix this class so that any object, not only BigDecimal can be printed
    //Test the functionality

    private final T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public T getThingToPrint() {
        return thingToPrint;
    }

}
