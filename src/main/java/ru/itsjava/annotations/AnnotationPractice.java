package ru.itsjava.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AnnotationPractice {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Person person = new Person("ivan", true);
        System.out.println(person);

        Class<? extends Person> aClass = person.getClass();
        System.out.println(aClass.getSimpleName());

        Class<?> aClass1 = Class.forName("ru.itsjava.annotations.Person");
        System.out.println(aClass1.getSimpleName());
        Person ivan = (Person) aClass1.getConstructor(String.class, boolean.class).newInstance("ivan", true);
        System.out.println(ivan);
        System.out.println(aClass1.getAnnotations()[0]);

        Field isGood = aClass1.getDeclaredField("isGood");
        isGood.setAccessible(true);
        isGood.setBoolean(ivan, false);
        System.out.println(ivan);
    }
}
