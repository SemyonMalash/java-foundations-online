package ru.itsjava.git;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private String name;
    private int age;

    public void birthday() {
        age++;
    }

    public boolean takeBeer() {
        return age > 18;
    }
}
