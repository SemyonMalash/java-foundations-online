package ru.itsjava.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {

        Man andrey = new Man("Андрей");
        Man maxim = new Man("Максим");
        Man vitya = new Man("Витя");

        Set<Man> manSet = new HashSet<>(Arrays.asList(andrey, maxim, vitya));
        System.out.println("manSet = " + manSet);
    }
}
