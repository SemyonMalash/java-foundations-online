package ru.itsjava.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<Watch> watchesList = new ArrayList<>();
        Watch seiko = new Watch("Seiko", "Vitaliy", 18000.0);
        Watch gShock = new Watch("GSHOCK", "Best dancer", 100000.0);

        watchesList.add(seiko);
        watchesList.add(gShock);

        for (Watch elemWatch : watchesList) {
            System.out.println(elemWatch);
        }

//        watchesList.remove(0);
        watchesList.remove(seiko);

        System.out.print("List: ");
        for (Watch elemWatch : watchesList) {
            System.out.print(elemWatch + " ");
        }
        System.out.println();


        System.out.println("watchesList.contains(gShock) = " + watchesList.contains(gShock));
        System.out.println("watchesList.contains(seiko) = " + watchesList.contains(seiko));

        System.out.println("watchesList = " + watchesList);

        System.out.println("watchesList.get(0).getFirm() = " + watchesList.get(0).getFirm());

        watchesList.set(0, seiko);

        System.out.println(watchesList);

        System.out.println("watchesList.size() = " + watchesList.size());


        List<Watch> watchesOmegaList = new ArrayList<>();
        Watch andrewOmega = new Watch("Omega", "Andrew", 100_000.0);
        Watch romanOmega = new Watch("Omega", "Roman", 100_000.0);

        watchesOmegaList.add(andrewOmega);
        watchesOmegaList.add(romanOmega);

        System.out.println("watchesOmegaList = " + watchesOmegaList);

        watchesList.addAll(watchesOmegaList);

        System.out.println(watchesList);

        Watch vitaliyWatch = new Watch("Seiko", "Vitaliy", 20_000.0);

        watchesList.add(1, vitaliyWatch);

        System.out.println(watchesList);


        List<Book> booksList = new ArrayList<>();

        List<Book> booksList2 = new ArrayList<>();

        Book book = new Book("Book");
        Book book2 = new Book("Book2");


        for (int i = 0; i < 20; i++) {
            booksList2.add(book);
        }

        System.out.println("booksList2.get(0) = " + booksList2.get(0));
        System.out.println("booksList2.get(19) = " + booksList2.get(19));

        for (int i = 0; i < 5; i++) {
            booksList2.add(book);
        }

        booksList2.add(5, book2);
        booksList2.set(2, book2);
        booksList2.remove(5);

        booksList2.add(6, book2);
        booksList2.set(0, book2);
        booksList2.remove(6);

        System.out.println(booksList2);

        booksList.addAll(booksList2);
        System.out.println(booksList);

        booksList.remove(book);
        System.out.println(booksList);

        booksList.remove(0);
        System.out.println(booksList);

        System.out.println("booksList.contains(book2) = " + booksList.contains(book2));

        System.out.print("List: ");
        for (Book bookElem : booksList) {
            System.out.print(bookElem + " ");
        }

    }

}































