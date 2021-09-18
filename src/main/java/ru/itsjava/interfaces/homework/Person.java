package ru.itsjava.interfaces.homework;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {

    private final String name;
    private final String surname;
    private int age;


    @Override
    public int compareTo(Person person) {

        if (surname.equals(person.surname)) {
            if (name.equals(person.name)) {
                return age - person.age;
            } else return -2;
        } else return -1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}




