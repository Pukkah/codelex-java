package io.codelex.oop.summary.lazybox;

import java.util.function.Supplier;

public class LazyBox<T> {
    private T result;
    private Supplier<T> supplier;

    public LazyBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {
        if (result == null) {
            result = supplier.get();
            System.out.println("Calculating!");
        }
        return result;
    }

}
