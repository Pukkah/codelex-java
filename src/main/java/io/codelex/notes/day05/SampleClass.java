package io.codelex.notes.day05;

public class SampleClass {
    /*
    === ACCESS MODIFIERS ===
    private - None
    No modifier (default) - Classes in the same package
    protected - Classes in package and subclasses inside or outside the package
    public - All classes
     */

    // Access Modifier examples
    public String name; // Public variable
    private int uid; // Private variable
    private static int count; // Private and Static variable

    private boolean active = false;


    // Constructor
    public SampleClass() {
        name = "unnamed";
        uid = ++count;
    }


    // Constructor with attribute (method overload)
    public SampleClass(String fullName) {
        this.name = fullName;
        uid = ++count;
    }

    // Constructor with two attributes (method overflow) + calling different constructor
    public SampleClass(String firstName, String lastName) {
        this(firstName + " " + lastName); // calling different constructor from constructor
    }


    // Getter example
    public int getUid(){
        return uid;
    }


    public static int getCount(){
        return count;
    }


    // Setter example
    public void setActive(boolean active) {
        this.active = active;
    }


    public boolean getActive() {
        return active;
    }


    // toString Method
    @Override
    public String toString(){
        return uid + "/" + count + ": " + name;
    }

}
