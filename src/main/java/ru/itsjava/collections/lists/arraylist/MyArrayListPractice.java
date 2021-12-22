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

        System.out.println("list.add(\"322\") = " + list.add("322"));

        System.out.println("list.contains(\"322\") = " + list.contains("322"));
        System.out.println("list.contains(\"321\") = " + list.contains("321"));

        list.add("311");
        list.add("312");
        list.add("312");
        System.out.println(list);

        list.remove(0);
        list.remove("311");
        System.out.println(list);
        System.out.println("list.lastIndexOf(\"312\") = " + list.lastIndexOf("312"));

        list.add("333");
        System.out.println(list);
        System.out.println("list.get(2) = " + list.get(2));

        list.add(101, 555555);
        list.add(102, 555555);
        System.out.println(list);

        System.out.println("list.set(5, 777) = " + list.set(5, 777));
        System.out.println(list);
    }
}
