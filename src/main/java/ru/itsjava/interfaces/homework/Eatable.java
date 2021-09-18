package ru.itsjava.interfaces.homework;

public interface Eatable {

    default void eat() {
        System.out.println("Eat!");
    }
}
