package ru.itsjava.threads.lesson2.homework;

public interface Eatable {

    default void eat() {
        System.out.println("Eat!");
    }
}
