package io.codelex.notes.day12;

public class InterfacesMain {
    public static void main(String[] args) {
        Dog aDog = new Dog("Reksis");
        printAnimalName(aDog);

        System.out.println(Days.MONDAY.getInLatvian());
    }

    public static void printAnimalName(Animal theAnimal) {
        System.out.println(theAnimal.getName());
    }

}