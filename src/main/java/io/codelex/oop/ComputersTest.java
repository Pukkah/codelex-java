package io.codelex.oop;

import io.codelex.oop.computers.Computer;
import io.codelex.oop.computers.Laptop;

public class ComputersTest {
    public static void main(String[] args) {

        Computer computer1 = new Computer("IBM", "Tower 2000K", "Pentium II", "none", 2);
        System.out.println(computer1);

        Computer computer2 = new Laptop("Apple", "MacBook", "M1", "Shared", 8, 5152);
        System.out.println(computer2);

        System.out.println(computer1.equals(computer2));

        Computer computer3 = new Laptop("Apple", "MacBook", "M1", "Shared", 8, 5152);
        System.out.println(computer2.equals(computer3));

    }

}
