package io.codelex.oop.summary.ordersandinvoices;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) throws BadFoodException {
        Item itemOne = new FoodItem("Milk", 1.31, LocalDate.of(2022, 4, 6));
        Item itemTwo = new ElectronicsItem("Light-bulb", 4.95, 40);
        Item itemThree = new HouseholdItem("Chair", 19.99, "red");

        Order order = new Order();
        try {
            order.addItem(itemOne);
        } catch (BadFoodException e) {
            System.out.println(e.getMessage());
        }
        order.addItem(itemTwo);
        order.addItem(itemThree);
        order.addItem(new ItemPacking());


        try {
            Invoice invoice = new Invoice(order, "ABC123");
            System.out.println(invoice);
        } catch (WrongOrderException e) {
            System.out.println(e.getMessage());
        }

    }

}
