package ru.itsjava.annotations.junit;

public class Main {

    public static void main(String[] args) {
        MyJUnit myJUnit = new MyJUnit(new MyFvoriteTest());
        myJUnit.start();
    }
}
