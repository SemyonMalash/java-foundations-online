package ru.itsjava.git.collections.lists.arraylist;

import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.arraylist.MyArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListTest {

    public static final String ELEMENT = "Привет";
    public static final String ELEMENT_2 = "Пока";


    @Test
    public void addByObj() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);

        assertEquals(1, list.size());
        assertEquals(ELEMENT, list.get(0));
    }

    @Test
    public void addByObjAndIndex() {
        MyArrayList list = new MyArrayList();
        list.add(1, ELEMENT);

        assertEquals(ELEMENT, list.get(1));
    }

    @Test
    public void indexOf() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.add(ELEMENT_2);

        assertEquals(1, list.indexOf(ELEMENT_2));
    }

    @Test
    public void lastIndexOf() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.add(ELEMENT_2);
        list.add(ELEMENT_2);

        assertEquals(2, list.lastIndexOf(ELEMENT_2));
    }

    @Test
    public void size() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.add(ELEMENT);

        assertEquals(2, list.size());
    }

    @Test
    public void set() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.add(ELEMENT);
        list.set(0, ELEMENT_2);

        assertEquals(ELEMENT_2, list.get(0));
    }

    @Test
    public void isEmpty() {
        MyArrayList list = new MyArrayList();

        assertEquals(true, list.isEmpty());
    }

    @Test
    public void contains() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);

        assertEquals(true, list.contains(ELEMENT));
    }

    @Test
    public void removeByObj() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.remove(ELEMENT);

        assertEquals(0, list.size());
    }

    @Test
    public void removeByIndex() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.remove(0);

        assertEquals(0, list.size());
    }

    @Test
    public void clear() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.clear();

        assertEquals(true, list.isEmpty());
    }

    @Test
    public void get() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);

        assertEquals(ELEMENT, list.get(0));
    }
}
