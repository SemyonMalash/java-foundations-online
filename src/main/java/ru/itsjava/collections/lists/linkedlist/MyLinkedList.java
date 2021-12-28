package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedList {
    private Node head;

    public int size() {
        int count = 0;
        Node curNode = head;
        while (curNode != null) {
            curNode = curNode.getNext();
            count++;
        }
        return count;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public boolean contains(Object o) {
        Node curNode = head;
        while (curNode != null) {
            if (o == curNode.getValue()) {
                return true;
            }
            curNode = curNode.getNext();
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList {" +
                "head = " + head +
                '}';
    }
}
