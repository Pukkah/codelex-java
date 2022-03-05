package io.codelex.classesandobjects.practice;

public class Product {

    private String name;
    private double price;
    private int amount;

    public static void main(String[] args) {

        // Create new Objects
        Product productOne = new Product("Logitech mouse", 70, 14);
        Product productTwo = new Product("iPhone 5s", 999.99, 3);
        Product productThree = new Product("Epson EB-U05", 440.46, 1);

        // Print them out
        productOne.printProduct();
        productTwo.printProduct();
        productThree.printProduct();

        // Change price
        productTwo.setPrice(0.49);
        productTwo.printProduct();

        // Change amount
        productThree.setAmount(49);
        productThree.printProduct();

    }

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        price = priceAtStart;
        amount = amountAtStart;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void printProduct() {
        System.out.printf("\"%s\", %.2f EUR, %d units%n", name, price, amount);
    }



}
