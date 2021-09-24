package ru.itsjava.git;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonTest {

    @Test
    public void shouldHaveCorrectConstructor() {
        Person person = new Person("Петя", 20);

        Assertions.assertEquals("Петя", person.getName());
        Assertions.assertEquals(20, person.getAge());
    }
}
