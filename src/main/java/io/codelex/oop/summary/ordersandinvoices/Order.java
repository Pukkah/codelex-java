package io.codelex.oop.summary.ordersandinvoices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Order extends ItemContainer {

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem) {
            if (((FoodItem) item).getBestBeforeDate().isBefore(LocalDate.now())) {
                throw new BadFoodException("Can't add expired food!");
            }
        }
        items.add(item);
    }

    @Override
    public String toString() {
        return items.stream()
                    .map(SellableThing::getFullInfo)
                    .collect(Collectors.joining("\n"));
    }

}
