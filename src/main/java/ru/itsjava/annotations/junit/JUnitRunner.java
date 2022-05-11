package ru.itsjava.annotations.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JUnitRunner {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MyFvoriteTest myFvoriteTest = new MyFvoriteTest();

        Method[] methods = MyFvoriteTest.class.getDeclaredMethods();

        System.out.println(Arrays.toString(methods));

        int passedTests = 0;
        int failedTests = 0;

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                System.out.println(method.getName());
                try {
                    method.invoke(myFvoriteTest);
                    System.out.println(method.getName() + " PASSED!");
                    passedTests++;
                } catch (InvocationTargetException exception) {
                    System.err.println(method.getName() + " FAILED!");
                    failedTests++;
                }
            }
        }

    }
}
