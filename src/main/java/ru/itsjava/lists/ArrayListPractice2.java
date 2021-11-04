package ru.itsjava.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 18_000.0);
        Watch viktorSeiko = new Watch("Seiko", "Viktor", 18_000.0);
        Watch dmitriySeiko = new Watch("Seiko", "Dmitriy", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(vitaliySeiko, viktorSeiko,
                dmitriySeiko, valentinOmega));

        System.out.println("Наши часы: " + watches);


        //Вывести все часы у которых фирма Seiko
        System.out.println("Вывести все часы у которых фирма Seiko");
        for (Watch elemWatch : watches) {
            if (elemWatch.getFirm().equals("Seiko")) {
                System.out.print(elemWatch + " ");
            }
        }
        System.out.println();

        //Вывести все часы у которых цена > 25000.0
        System.out.println("Вывести все часы у которых цена > 25000.0");
        for (Watch watch : watches) {
            if (watch.getPrice() > 25000.0) {
                System.out.print(watch + " ");
            }
        }
        System.out.println();


        //Вывести одни часы у которых цена > 25000.0
        System.out.println("Вывести одни часы у которых цена > 25000.0");
        for (Watch watch : watches) {
            if (watch.getPrice() > 25000.0) {
                System.out.print(watch + " ");
                break;
            }
        }
        System.out.println();

        //пропустить первые два элемента фирмы Seiko
        System.out.println("пропустить первые два элемента фирмы Seiko");
        int seikoCount = 0;
        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getFirm().equals("Seiko") && seikoCount < 2) {
                seikoCount++;
            } else {
                System.out.println(watches.get(i));
            }
        }
        System.out.println();

        Person person = new Person("Николай", 20, true);
        Person person1 = new Person("Иван", 20, true);
        Person person2 = new Person("Кирилл", 16, true);
        Person person3 = new Person("Мария", 22, false);
        Person person4 = new Person("Мария", 30, false);
        Person person5 = new Person("Мария", 50, false);

        List<Person> persons = new ArrayList<>(Arrays.asList(person, person1, person2, person3, person4, person5));

        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().charAt(0) == 'Н' && persons.get(i).isMale() == true
                    && persons.get(i).getAge() > 18 && persons.get(i).getAge() < 27) {
                System.out.println(persons.get(i));
            }
        }

        int count = 0;
        int sum = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).isMale() == false) {
                count++;
                sum += persons.get(i).getAge();
            }
        }
        System.out.println("Средний возраст всех женщин = " + sum / count);
    }
}