package ru.itsjava.threads.lesson2.homework;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Man man = new Man();
        System.out.println("Man: ");
        man.eat();
        man.talk();

        System.out.println();

        Cow cow = new Cow();
        System.out.println("Cow: ");
        cow.eat();
        cow.talk();

        System.out.println();

        Plant plant = new Plant();
        System.out.println("Plant: ");
        plant.eat();
        plant.talk();


//        Person person = new Person("Иван", "Иванов", 30);
//        Person person2 = new Person("Иван", "Иванов", 29);
//        Person person3 = new Person("Иван", "Иванов", 22);
//        Person person4 = (Person) person.clone();
//
//        Person[] persons = {person, person2, person3, person4};
//
//        System.out.println("person.compareTo(person2) = " + person.compareTo(person2));
//
//        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));
//        Arrays.sort(persons);
//        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));
    }
}
