package io.codelex.oop.summary.ordersandinvoices;

public class HouseholdItem extends AbstractItem {
    private String color;

    public HouseholdItem(String name, Double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getFullInfo() {
        return super.getFullInfo()
                + ", color: "
                + getColor();
    }

}
