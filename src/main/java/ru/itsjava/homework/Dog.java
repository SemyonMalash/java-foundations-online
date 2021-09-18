package ru.itsjava.homework;

public class Dog implements Runnable{

    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public int maxRunDistance() {

        return 100;
    }
}
