package io.codelex.notes.day05;

public class Classes {
    public static void main(String[] args) {

        // See ./SampleClass.java

        // Creating new instance object
        SampleClass instanceOne = new SampleClass();
        System.out.println(instanceOne.name); // Accessing public variable
        System.out.println(instanceOne.getUid()); // Accessing public method to get private variable
        System.out.println(SampleClass.getCount()); // Accessing static method

        SampleClass instanceTwo = new SampleClass("Pēteris Kļaviņš");
        System.out.println(instanceTwo.getUid() + "/" + SampleClass.getCount() + ": " + instanceTwo.name);

        SampleClass instanceThree = new SampleClass("Miks", "Ramāns");
        System.out.println(instanceThree); // toString()

        System.out.println(instanceThree.getActive());
        instanceThree.setActive(true);
        System.out.println(instanceThree.getActive());

    }
}
