package ru.itsjava.homework;

public class Cat implements Runnable {

    public void run() {
        System.out.println("Run");
    }

    public int maxRunDistance() {
        return 50;
    }
}
