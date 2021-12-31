package ru.itsjava.collections.lists.linkedlist;

import java.util.LinkedList;

public class MyLinkedListPractice {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        new LinkedList<>().clear();

        list.add(11);
        list.add(22);
        list.add(null);
        list.add(44);

        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.get(3) = " + list.get(3));
        System.out.println("list.get(4) = " + list.get(4));
        System.out.println("list.get(5) = " + list.get(5));
        System.out.println("list.set(2, 555) = " + list.set(2, 555));
        System.out.println(list);

//        System.out.println("list.remove(-1) = " + list.remove(-1));
//        System.out.println("list.remove(0) = " + list.remove(0));
//        System.out.println("list.remove(1) = " + list.remove(1));
//        System.out.println("list.remove(2) = " + list.remove(2));
//        System.out.println("list.remove(null) = " + list.remove(3));
//        System.out.println("list.remove(4) = " + list.remove(4));


//        System.out.println("list.size() = " + list.size());
//        System.out.println("list.contains('3') = " + list.contains('3'));
//
//        System.out.println("list.remove(1) = " + list.remove(1));
//        System.out.println("list = " + list);


    }
}
