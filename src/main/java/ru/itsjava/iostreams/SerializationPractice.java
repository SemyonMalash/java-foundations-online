package ru.itsjava.iostreams;

import ru.itsjava.collections.maps.Man;

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Man man = new Man("Peter");
//
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/man.out"))) {
//            outputStream.writeObject(man);
//        }
//        try (ObjectInputStream inputStream = new ObjectInputStream(
//                new FileInputStream("src/main/resources/man.out"))) {
//            Object obj = inputStream.readObject();
//            Man man = (Man) obj;
//            System.out.println("Man = " + man);
//        }

        User user = new User("admin", "admin");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/resources/user.out"))) {
            outputStream.writeObject(user);
        }
        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("src/main/resources/user.out"))) {
            Object obj = inputStream.readObject();
            User user1 = (User) obj;
            user1.setPassword(user.getPassword());
            System.out.println("User1 = " + user1);
        }
    }
}