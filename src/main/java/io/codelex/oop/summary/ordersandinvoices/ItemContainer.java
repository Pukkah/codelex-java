package io.codelex.oop.summary.ordersandinvoices;

import java.util.List;

abstract class ItemContainer {

    protected List<SellableThing> items;

    protected List<SellableThing> getItemsList() {
        return items;
    }

    protected double getSum() {
        return items.stream()
                    .mapToDouble(SellableThing::getPrice)
                    .sum();
    }

}
