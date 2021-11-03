package ru.itsjava.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {

   private final String name;
   private int age;

    public void ageCorrect() {

        if (age < 0) {
            throw new AgeNotValidException("Некорректный возраст");
        } else if (age > 150) {
            throw new AgeNotValidException("Некорректный возраст");
        }
    }
}

