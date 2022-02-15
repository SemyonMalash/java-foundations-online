package ru.itsjava.collections.maps;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
//        Map<Man, String> men = new HashMap<>();
//
//        Man ivanov = new Man("Иванов");
//        Man sidorov = new Man("Сидоров");
//        Man javov = new Man("Джавов");
//
//        men.put(ivanov, "футболка");
//        men.put(sidorov, "свитшот");
//        men.put(javov, "свитер");
//
//        for (Map.Entry<Man, String> pair : men.entrySet()) {
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }
//
//        System.out.println("men.remove(ivanov) = " + men.remove(ivanov));
//
//        System.out.println("--------------------");
//        for (Man keyMan : men.keySet()) {
//            System.out.println(keyMan + ": " + men.get(keyMan));
//        }
//
//        System.out.println("men.size() = " + men.size());
//        System.out.println("men.isEmpty() = " + men.isEmpty());
//
//        System.out.println("men.replace(javov, \"свитер\", \"перчатки\") = " + men.replace(javov, "свитер", "перчатки"));
//        System.out.println("men.get(javov) = " + men.get(javov));
//
//        men.clear();
//        System.out.println("men.size() = " + men.size());


        Map<Man, Fruit> customers = new HashMap<>();

        Man anov = new Man("анов");
        Man sidorov = new Man("Сидоров");
        Man avov = new Man("авов");
        Man petrov = new Man("Петров");
        Man adubov = new Man("адубов");

        Fruit apple = new Fruit("Абрикос", 15);
        Fruit orange = new Fruit("Арбуз", 20);
        Fruit banana = new Fruit("Арбуз", 30);
        Fruit melon = new Fruit("Арбуз", 200);
        Fruit apricot = new Fruit("Дыня", 10);

        customers.put(anov, apple);
        customers.put(sidorov, orange);
        customers.put(avov, banana);
        customers.put(petrov, melon);
        customers.put(adubov, apricot);

        System.out.println("customers.get(petrov) = " + customers.get(petrov));

        //System.out.println("customers.remove(ivanov, apple) = " + customers.remove(ivanov, apple));
        System.out.println("customers.get(ivanov) = " + customers.get(anov));

        System.out.println("customers.keySet() = " + customers.keySet());
        System.out.println("customers.values() = " + customers.values());
        System.out.println("customers.entrySet() = " + customers.entrySet());

        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        int keyCount = 0;
        for (Man keyCustomers : customers.keySet()) {
            if (keyCustomers.getName().length() > 5) {
                keyCount++;
            }
        }
        System.out.println(keyCount);

        int melonCount = 0;
        for (Fruit valueCustomers : customers.values()) {
            if (valueCustomers.getName().equals("Дыня")) {
                melonCount++;
            }
        }
        System.out.println(melonCount);

        System.out.println("\"7a\" = " + "7a");
        int watermelonCount = 0;
        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            if (pair.getValue().getName().equals("Арбуз") && watermelonCount < 2) {
                watermelonCount++;
                continue;
            }
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        System.out.println("__________________________");

        System.out.println("\"7b\" = " + "7b");
        int aCount = 0;
        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            if (pair.getKey().getName().charAt(0) == 'а' && aCount < 2) {
                aCount++;
                continue;
            }
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        System.out.println("__________________________");

        System.out.println("customers.entrySet() = " + customers.entrySet());

        System.out.println("__________________________");

        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("арбуз")) {
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
            break;
        }

        Map<Man, Fruit> customers2 = new HashMap<>();
        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            if (pair.getValue().getName().equals("Арбуз") || pair.getValue().getName().equals("Дыня")) {
                customers2.put(pair.getKey(), pair.getValue());
            }
        }
        System.out.println("customers2.entrySet() = " + customers2.entrySet());

        int count = 0;
        int sumWeight = 0;
        int mediumWeight = 0;
        for (Fruit valueCustomers : customers.values()) {
            sumWeight += valueCustomers.getWeight();
            count++;
        }
        mediumWeight = sumWeight / count;
        System.out.println("mediumWeight = " + mediumWeight);
    }
}