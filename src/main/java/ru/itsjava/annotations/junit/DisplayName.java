package ru.itsjava.annotations.junit;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DisplayName {
    String value();
}
