package ru.itsjava.exceptions;

public class Person {

    String name;
    int age;

    public int ageCorrect(int age) {

        if (age < 0) {
            throw new AgeNotValidException("Некорректный возраст");
        } else if (age > 150) {
            throw new AgeNotValidException("Некорректный возраст");
        } else return age;
    }
}

