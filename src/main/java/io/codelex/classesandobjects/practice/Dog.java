package io.codelex.classesandobjects.practice;

public class Dog {
    private String name;
    private Sex sex;
    private Dog mother;
    private Dog father;

    public Dog(String name, Sex sex, Dog mother, Dog father) {
        this(name, sex);
        assignParents(mother, father);
    }

    public Dog(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public static void main(String[] args) {

        // Generate Dog Objects
        Dog[] dogs = new Dog[8];
        dogs[0] = new Dog("Max", Sex.MALE);
        dogs[1] = new Dog("Rocky", Sex.MALE);
        dogs[2] = new Dog("Sparky", Sex.MALE);
        dogs[3] = new Dog("Buster", Sex.MALE);
        dogs[4] = new Dog("Sam", Sex.MALE);
        dogs[5] = new Dog("Lady", Sex.FEMALE);
        dogs[6] = new Dog("Molly", Sex.FEMALE);
        dogs[7] = new Dog("Coco", Sex.FEMALE);

        // Assign Mothers and Fathers
        dogs[0].assignParents(dogs[5], dogs[1]); // Max
        dogs[7].assignParents(dogs[6], dogs[3]); // Coco
        dogs[1].assignParents(dogs[6], dogs[4]); // Rocky
        dogs[3].assignParents(dogs[5], dogs[2]); // Buster

        // Print out Dogs
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        // Print Father names
        for (Dog dog : dogs) {
            System.out.println(dog + " father: " + dog.fathersName());
        }

        // Same mother test
        System.out.println(dogs[0].hasSameMotherAs(dogs[3])); // expected true
        System.out.println(dogs[0].hasSameMotherAs(dogs[7])); // expected false
        System.out.println(dogs[2].hasSameMotherAs(dogs[6])); // expected false

    }

    public void assignParents(Dog mother, Dog father) {
        this.mother = mother;
        this.father = father;
    }

    public String fathersName() {
        if (father != null) {
            return father.name;
        } else {
            return "Unknown";
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (mother != null && otherDog.mother != null) {
            return mother == otherDog.mother;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", name, sex);
    }

    public enum Sex { // jā, šī varētu būt atsevišķa klase, bet ērtības labad vēlos iekļauties vienā failā...
        MALE, FEMALE
    }

}
