package ru.itsjava.iostreams;

import java.io.*;

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

        File file = new File("src/main/resources/file.txt");

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("1324525");
            printWriter.println("13245257677777");
            printWriter.println("1324525999999");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("reader.readLine() = " + reader.readLine());
            System.out.println("reader.readLine() = " + reader.readLine());
            System.out.println("reader.readLine() = " + reader.readLine());
        }
    }
}
