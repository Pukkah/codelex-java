package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer{
    private int batteryInMAh;

    public Laptop(String company, String model, String processor, String graphicsCard, int ramInGB, int batteryInMAh) {
        super(company, model, processor, graphicsCard, ramInGB);
        this.batteryInMAh = batteryInMAh;
    }

    public int getBatteryInMAh() {
        return batteryInMAh;
    }

    public void setBatteryInMAh(int batteryInMAh) {
        this.batteryInMAh = batteryInMAh;
    }

    @Override
    public String toString() {
        return "Laptop " +
                super.toString() +
                ", Battery='" + batteryInMAh + "mAh'";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Laptop laptop = (Laptop) o;
        return batteryInMAh == laptop.batteryInMAh;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryInMAh);
    }

}
