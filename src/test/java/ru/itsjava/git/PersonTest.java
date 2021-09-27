package ru.itsjava.git;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен: ")
public class PersonTest {

    public static final String DEFAULT_NAME = "Петя";
    public static final int DEFAULT_AGE = 20;
    public static final String NEW_NAME = "Вася";

    @DisplayName("Корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertEquals(DEFAULT_NAME, person.getName());
        assertEquals(DEFAULT_AGE, person.getAge());
    }

    @DisplayName("Корректно изменять имя")
    @Test
    public void shouldCorrectlyUpdatePerson() {
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        person.setName(NEW_NAME);
        assertEquals(NEW_NAME, person.getName());
    }

    @DisplayName("Корректно увеличивать возраст")
    @Test
    public void shouldCorrectlyIncreaseAge() {
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        person.birthday();
        assertEquals(DEFAULT_AGE + 1, person.getAge());
    }

    @DisplayName("Корректно сравнивать возраст")
    @Test
    public void shouldCorrectlyCompareAge() {
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Person person2 = new Person(DEFAULT_NAME, 17);

        person.takeBeer();
        person2.takeBeer();

        //assertAll();
        assertTrue(person.takeBeer());
        assertFalse(person2.takeBeer());
    }

    @Test
    public void shouldCorrectlyComparePersons() {
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Person person2 = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertEquals(person, person2);
    }
}
