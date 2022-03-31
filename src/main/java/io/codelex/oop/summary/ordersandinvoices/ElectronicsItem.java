package io.codelex.oop.summary.ordersandinvoices;

public class ElectronicsItem extends AbstractItem {
    private Integer powerInWatts;

    public ElectronicsItem(String name, Double price, Integer powerInWatts) {
        super(name, price);
        this.powerInWatts = powerInWatts;
    }

    public Integer getPowerInWatts() {
        return powerInWatts;
    }

    @Override
    public String getFullInfo() {
        return super.getFullInfo()
                + ", power: "
                + getPowerInWatts() + "W";
    }

}
