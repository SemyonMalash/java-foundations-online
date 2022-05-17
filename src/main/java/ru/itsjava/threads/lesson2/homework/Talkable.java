package ru.itsjava.threads.lesson2.homework;

public interface Talkable {

    default void talk() {
        System.out.println("Hi!");
    }
}
