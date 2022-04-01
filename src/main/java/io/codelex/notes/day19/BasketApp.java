package io.codelex.notes.day19;

import io.codelex.notes.day19.basket.*;

public class BasketApp {
    public static void main(String[] args) throws BasketFullException, BasketEmptyException {
        Basket<Apple> basketOfApples = new Basket<>();
        try {
            Apple canIGetAnApple = basketOfApples.removeFromBasket();
        } catch (BasketEmptyException e) {
            System.out.println("Basket is empty!!!");
        }
        Apple apple = new Apple();
        basketOfApples.addToBasket(apple);
        Apple sameApple = basketOfApples.removeFromBasket();

        Basket<Mushroom> bucketOfMushrooms = new Basket<>();
        Mushroom mushroom = new Mushroom();
        for (int i = 0; i < 10; i++) {
            bucketOfMushrooms.addToBasket(mushroom);
        }
        try {
            bucketOfMushrooms.addToBasket(mushroom);
        } catch (BasketFullException e) {
            System.out.println("Basket is FULL!!!");
        }
    }

}
