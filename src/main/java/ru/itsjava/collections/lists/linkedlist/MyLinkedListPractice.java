package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.add('1');
        list.add('2');
        list.add('3');
        System.out.println(list);

        System.out.println("list.size() = " + list.size());
        System.out.println("list.contains('3') = " + list.contains('3'));
    }
}
