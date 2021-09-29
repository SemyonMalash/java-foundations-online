package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {

//        String name = "Vitaliy";
//        String copyName = "Vitaliy";
//        System.out.println("(name == copyName) = " + (name == copyName));
//
//        String constructorName = new String("Vitaliy");
//        System.out.println("(constructorName == name) = " + (constructorName == name));
//
//        String internConstructorName = constructorName.intern();
//        System.out.println("(internConstructorName == name) = " + (internConstructorName == name));


        String str = "Я строка";

        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());

        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА"));
        System.out.println("str.equalsIgnoreCase(\"Я строкА\") = " + str.equalsIgnoreCase("Я строкА"));

        String[] strs = str.split(" ");
        System.out.println(strs[0]);
        System.out.println(strs[1]);


        StringBuilder stringBuilderStr = new StringBuilder(str);
        for (int i = 0; i < 1_000_000; i++) {
            stringBuilderStr.append('!');
        }

        System.out.println(stringBuilderStr.toString());

        // приводит строку к верхнему регистру
        System.out.println("str.toUpperCase() = " + str.toUpperCase());

        // преобразует строку в массив символов
        char[] strChar = str.toCharArray();

        for (int i = 0; i < strChar.length; i++) {
            System.out.println(strChar[i]);
        }

        // меняет последовательность символов
        StringBuilder reverseStr = new StringBuilder(str);
        System.out.println("reverseStr.reverse() = " + reverseStr.reverse());

    }
}