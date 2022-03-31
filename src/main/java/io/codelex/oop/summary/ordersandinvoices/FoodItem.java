package io.codelex.oop.summary.ordersandinvoices;

import java.time.LocalDate;

public class FoodItem extends AbstractItem {
    private LocalDate bestBeforeDate;

    public FoodItem(String name, Double price, LocalDate bestBeforeDate) {
        super(name, price);
        this.bestBeforeDate = bestBeforeDate;
    }

    public LocalDate getBestBeforeDate() {
        return bestBeforeDate;
    }

    @Override
    public String getFullInfo() {
        return super.getFullInfo()
                + ", best before: "
                + getBestBeforeDate();
    }

}
