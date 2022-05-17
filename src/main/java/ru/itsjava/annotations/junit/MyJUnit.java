package ru.itsjava.annotations.junit;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class MyJUnit {
    private final Object objTestClass;
    private int passedTests = 0;
    private int failedTests = 0;
    private final List<Method> beforeAllMethods = new ArrayList<>();
    private final List<Method> afterAllMethods = new ArrayList<>();
    private final List<Method> testMethods = new ArrayList<>();
    private final List<Method> beforeMethods = new ArrayList<>();
    private final List<Method> afterMethods = new ArrayList<>();
    private final List<Method> displayNameMethods = new ArrayList<>();

    @SneakyThrows
    public void start() {
        fillAllMethodsGroups();

        for (Method method : beforeAllMethods) {
            method.invoke(objTestClass);
        }

        for (Method method : testMethods) {
            try {
                for (Method beforeMethod : beforeMethods) {
                    beforeMethod.invoke(objTestClass);
                }
                if (method.isAnnotationPresent(DisplayName.class)) {
                    System.out.println(method.getDeclaredAnnotation(DisplayName.class).value());
                }
                method.invoke(objTestClass);
                System.out.println(method.getName() + " PASSED!");
                passedTests++;
                for (Method afterMethod : afterMethods) {
                    afterMethod.invoke(objTestClass);
                }
            } catch (InvocationTargetException exception) {
                System.err.println(method.getName() + " FAILED!");
                failedTests++;
                for (Method afterMethod : afterMethods) {
                    afterMethod.invoke(objTestClass);
                }
            }
        }
        printResults();

        for (Method method : afterAllMethods) {
            method.invoke(objTestClass);
        }
    }

    private void fillAllMethodsGroups() {
        for (Method method : objTestClass.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeAll.class)) {
                beforeAllMethods.add(method);
            } else if (method.isAnnotationPresent(Test.class)) {
                testMethods.add(method);
            } else if (method.isAnnotationPresent(AfterAll.class)) {
                afterAllMethods.add(method);
            } else if (method.isAnnotationPresent(Before.class)) {
                beforeMethods.add(method);
            } else if (method.isAnnotationPresent(After.class)) {
                afterMethods.add(method);
            }
        }
    }

    private void printResults() {
        System.out.println("Количество пройденных тестов: " + passedTests);
        System.out.println("Количество непройденных тестов: " + failedTests);
    }
}
