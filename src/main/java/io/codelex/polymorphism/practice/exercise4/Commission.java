package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales;
    private double commisionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commisionRate = commisionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + totalSales * commisionRate;
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }

}
