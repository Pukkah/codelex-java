package io.codelex.notes.day14;

public class Bottle<T extends Liquid> {
    private T contents;

    public Bottle(T contents) {
        this.contents = contents;
    }

    public void pourOutContents() {
        System.out.println(contents + " has been poured out!");
    }

}
