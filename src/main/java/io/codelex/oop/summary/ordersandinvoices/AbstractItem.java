package io.codelex.oop.summary.ordersandinvoices;

abstract class AbstractItem implements Item {
    private String name;
    private Double price;

    public AbstractItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getFullInfo() {
        return getName() + ", " + getPrice() + " EUR";
    }

    @Override
    public String toString() {
        return getFullInfo();
    }

}
