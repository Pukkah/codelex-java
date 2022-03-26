package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> loudThings = new ArrayList<>();
        loudThings.add(new Parrot());
        loudThings.add(new Firework());
        loudThings.add(new Firework());
        loudThings.add(new Radio());
        loudThings.add(new Parrot());
        loudThings.add(new Radio());
        loudThings.forEach(Sound::playSound);
    }

}
