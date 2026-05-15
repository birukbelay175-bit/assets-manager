package com.pluralsight;

public class App {

    public static void main(String[] args) {

        House house = new House(
                "My House",
                "2020-01-01",
                250000,
                "123 Main St",
                1,
                2000,
                5000
        );

        Vehicle vehicle = new Vehicle(
                "My Car",
                "2022-05-10",
                30000,
                "Toyota Camry",
                2022,
                40000
        );

        System.out.println("HOUSE INFO");
        System.out.println("Value: $" + house.getValue());

        System.out.println();

        System.out.println("VEHICLE INFO");
        System.out.println("Value: $" + vehicle.getValue());

        Cash cash = new Cash(
                "Emergency Cash",
                "2024-01-01",
                5000
        );

        System.out.println("CASH INFO");
        System.out.println("Value: $" + cash.getValue());
    }
}