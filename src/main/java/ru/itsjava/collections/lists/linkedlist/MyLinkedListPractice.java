package ru.itsjava.collections.lists.linkedlist;

import java.util.LinkedList;

public class MyLinkedListPractice {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        new LinkedList<>().clear();

        list.add(11);
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(44);
        list.add(null);

        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.get(3) = " + list.get(3));
        System.out.println("list.get(4) = " + list.get(4));
        System.out.println("list.get(5) = " + list.get(5));
        System.out.println(list);

        System.out.println("list.contains(44) = " + list.contains(44));
        System.out.println("list.indexOf(11) = " + list.indexOf(11));
        System.out.println("list.indexOf(22) = " + list.indexOf(22));
        System.out.println("list.indexOf(33) = " + list.indexOf(33));
        System.out.println("list.indexOf(44) = " + list.indexOf(44));
        System.out.println("list.indexOf(null) = " + list.indexOf(null));

        System.out.println("list.lastIndexOf(null) = " + list.lastIndexOf(44));


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
