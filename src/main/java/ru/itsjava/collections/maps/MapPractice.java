package ru.itsjava.collections.maps;

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

        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man javov = new Man("Джавов");
        Man petrov = new Man("Петров");
        Man dubov = new Man("Дубов");

        Fruit apple = new Fruit("Яблоко", 15);
        Fruit orange = new Fruit("Апельсин", 20);
        Fruit banana = new Fruit("Банан", 30);
        Fruit melon = new Fruit("Дыня", 200);
        Fruit apricot = new Fruit("Абрикос", 10);

        customers.put(ivanov, apple);
        customers.put(sidorov, orange);
        customers.put(javov, banana);
        customers.put(petrov, melon);
        customers.put(dubov, apricot);

        System.out.println("customers.get(petrov) = " + customers.get(petrov));

        System.out.println("customers.remove(ivanov, apple) = " + customers.remove(ivanov, apple));
        System.out.println("customers.get(ivanov) = " + customers.get(ivanov));

        System.out.println("customers.keySet() = " + customers.keySet());
        System.out.println("customers.values() = " + customers.values());
        System.out.println("customers.entrySet() = " + customers.entrySet());

        //Можно и так, но не очень понимаю зачем, если есть toString :)
        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
