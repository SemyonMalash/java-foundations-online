package ru.itsjava.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesPractice {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/application.properties");
        Properties props = new Properties();
        props.load(new FileInputStream(file));

        System.out.println("props.getProperty(\"key\") = " + props.getProperty("key"));

        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("application.properties");
        Properties props2 = new Properties();
        props2.load(inputStream);

        System.out.println("props2.getProperty(\"key\") = " + props2.getProperty("key"));

        ClassLoader classLoader1 = PropertiesPractice.class.getClassLoader();
        InputStream inputStream1 = classLoader1.getResourceAsStream("myapplication.properties");
        Properties myProperties = new Properties();
        myProperties.load(inputStream1);

        System.out.println("myProperties.getProperty(Semyon) = " + myProperties.getProperty("Semyon"));
    }
}
