package ru.itsjava.interfaces.homework;

public interface Talkable {

    default void talk() {
        System.out.println("Hi!");
    }
}
