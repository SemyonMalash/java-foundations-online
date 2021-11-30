package ru.itsjava.collections.lists.arraylist;

public class MyArrayListPractice {

    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        list.add("123");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("322");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");
        list.add("321");

        System.out.println("list.toString() = " + list.toString());

        System.out.println("list.indexOf(322) = " + list.indexOf("322"));

        list.clear();

        System.out.println("list.isEmpty() = " + list.isEmpty());

        System.out.println("list.toString() = " + list.toString());

        System.out.println("list.size() = " + list.size());


    }
}
