package ru.itsjava.homework;

public class Man extends Person implements Walkable{

    @Override
    public void walk() {
        System.out.println("Walk");
    }


    @Override
    public void sayHi() {
        System.out.println("Man says Hi");;
    }
}
