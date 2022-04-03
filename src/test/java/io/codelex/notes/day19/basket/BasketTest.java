package io.codelex.notes.day19.basket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    void canAddApples() throws BasketFullException {
        Basket<Apple> basket = new Basket<>();
        Apple apple = new Apple();
        basket.addToBasket(apple);
    }

    @Test
    void canAddMushrooms() throws BasketFullException {
        Basket<Mushroom> basket = new Basket<>();
        Mushroom mushroom = new Mushroom();
        basket.addToBasket(mushroom);
    }

    @Test
    void canRemoveItems() throws BasketFullException, BasketEmptyException {
        Basket<Apple> basket = new Basket<>();
        Apple apple = new Apple();
        basket.addToBasket(apple);
        Assertions.assertEquals(apple, basket.removeFromBasket());
    }

    @Test
    void throwsBasketEmptyException() {
        Basket<Apple> basket = new Basket<>();
        Assertions.assertThrows(BasketEmptyException.class, basket::removeFromBasket);
    }

    @Test
    void throwsBasketFullException() throws BasketFullException {
        Basket<Apple> basket = new Basket<>();
        Apple apple = new Apple();
        for (int i = 0; i < 10; i++) {
            basket.addToBasket(apple);
        }
        Assertions.assertThrows(BasketFullException.class, () -> basket.addToBasket(apple));
    }

}
