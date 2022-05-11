package ru.itsjava.annotations;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@MyAnnotation(message = "message", flag = true)
public class Person {
    private final String name;
    private boolean isGood;

//    public Person(String name, boolean isGood) {
//        this.name = name;
//        this.isGood = isGood;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", isGood=" + isGood +
                '}';
    }
}
