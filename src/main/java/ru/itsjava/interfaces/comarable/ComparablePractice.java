package ru.itsjava.interfaces.comarable;

import java.util.Arrays;


public class ComparablePractice {

    public static void main(String[] args) {

        Boy vitalic = new Boy("Vitalik", 15, 165);
        Boy vasia = new Boy("Vasia", 14, 160);
        Boy vania = new Boy("Vania", 18, 180);

        System.out.println("vitalic.compareTo(vasia) = " + vitalic.compareTo(vasia));
        System.out.println("vania.compareTo(vasia) = " + vania.compareTo(vasia));

        Boy[] boys = {vitalic, vania, vasia};
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
        Arrays.sort(boys);
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));



    }
}
