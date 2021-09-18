package ru.itsjava.homework;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {

    private String name;
    private final String brand;
    private static int price = 1_000_000;

    public static int getPrice() {
        return price;
    }
}
