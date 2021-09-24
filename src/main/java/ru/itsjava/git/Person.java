package ru.itsjava.git;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

   private String name;
   private int age;

    public void birthday() {
        age += 1;
    }

    public boolean takeBeer() {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }
}
