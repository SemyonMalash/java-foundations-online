package ru.itsjava.exceptions;

import java.io.IOException;

public class ExceptionPractice {

    public static void main(String[] args) {

//        throw new RuntimeException("111");
//        throw new Exception("111");

//        try {
//            System.out.println("BEGIN");
////            throw new IOException();
//        } catch (Exception e) {
//            System.out.println("CATCH");
////            e.printStackTrace();
//        } finally {
//            System.out.println("FINALLY");
//        }
//        System.out.println("END");


        try {
            throw new RuntimeException();
        } catch (RuntimeException runtimeException) {
            System.out.println("Runtime exception");
        } catch (Throwable throwable) {
            System.out.println("Throwable");
        }

        Calculator calculator = new Calculator();

        try {
            System.out.println("calculator.division(5, 0) = " + calculator.division(5, 0));
        } catch (CalculatorException ce) {
            System.out.println("!!!");
            ce.printStackTrace();
        }

        Person person = new Person();

        System.out.println("person.ageCorrect() = " + person.ageCorrect(180));
        System.out.println("person.ageCorrect() = " + person.ageCorrect(-5));
        System.out.println("person.ageCorrect() = " + person.ageCorrect(50));

    }
}
