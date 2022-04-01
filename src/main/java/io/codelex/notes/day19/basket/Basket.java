package io.codelex.notes.day19.basket;

import java.util.Stack;

public class Basket<T> {
    private static final int MAX_CAPACITY = 10;
    private Stack<T> contents = new Stack<>();

    public void addToBasket(T item) throws BasketFullException {
        if (contents.size() >= MAX_CAPACITY) {
            throw new BasketFullException();
        }
        contents.add(item);
    }

    public T removeFromBasket() throws BasketEmptyException {
        if (contents.isEmpty()) {
            throw new BasketEmptyException();
        }
        return contents.pop();
    }

}
