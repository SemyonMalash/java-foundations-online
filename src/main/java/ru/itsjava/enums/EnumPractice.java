package ru.itsjava.enums;

import java.util.Arrays;

public class EnumPractice {

    public static void main(String[] args) {
        System.out.println("Season.WINTER = " + Season.WINTER);

        Season[] seasons = Season.values();
        System.out.println("Arrays.toString(seasons) = " + Arrays.toString(seasons));

//        for (Season season : seasons) {
//            System.out.print(season + " ");
//        }
//        System.out.println();

        Season season = Season.AUTUMN;
        switch (season) {
            case AUTUMN:
                System.out.println("У нас осень");
                break;
            case SPRING:
                System.out.println("У нас весна");
                break;
            default:
                System.out.println("У нас не весна и не осень");
        }

        System.out.println(Coffee.AMERICANO);
    }
}
