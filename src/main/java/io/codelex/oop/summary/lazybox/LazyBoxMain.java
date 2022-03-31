package io.codelex.oop.summary.lazybox;

public class LazyBoxMain {
    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(LazyBoxMain::calculate);

        //First time calling get - it should calculate the value
        Integer contents = box.get();
        System.out.println(contents);

        //Second time calling get - it should just return previously calculated value and not calculate again
        Integer contents2 = box.get();
        System.out.println(contents2);
    }

    public static Integer calculate() {
        return 200;
    }

}
