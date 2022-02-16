package ru.itsjava.iostreams;

import java.io.*;
import java.util.ArrayList;

public class IOStreamsPractice {
    public static void main(String[] args) throws IOException {

//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = console.readLine();
//            System.out.println(input);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        } finally {
//            try {
//                console.close();
//            } catch (IOException exception) {
//                exception.printStackTrace();
//            }
//        }

//        //try with resources
//        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
//            String input = console.readLine();
//            System.out.println(input);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

//        File file = new File("src/main/resources/file.txt");
//
//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            printWriter.println("1324525");
//            printWriter.println("13245257677777");
//            printWriter.println("1324525999999");
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            System.out.println("reader.readLine() = " + reader.readLine());
//            System.out.println("reader.readLine() = " + reader.readLine());
//            System.out.println("reader.readLine() = " + reader.readLine());
//        }

        File file1 = new File("src/main/resources/file1.txt");
        try (PrintWriter printWriter = new PrintWriter(file1)) {
            printWriter.println("11111");
        }
        File file2 = new File("src/main/resources/file2.txt");
        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println("22222");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            System.out.println(reader.readLine());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            System.out.println(reader.readLine());
        }

        ArrayList change = new ArrayList();

        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            change.add(0, reader.readLine());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            change.add(1, reader.readLine());
        }
        try (PrintWriter printWriter = new PrintWriter(file1)) {
            printWriter.println(change.get(1));
        }
        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println(change.get(0));
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            System.out.println(reader.readLine());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            System.out.println(reader.readLine());
        }
    }
}