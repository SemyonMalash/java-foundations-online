package ru.itsjava.annotations;

import lombok.Getter;

@Department(name = "Кафедра медицинской биологии")
@Getter
public class BiologyStudent {
    private String name = "Петр";
    private String surname = "Петров";
    private String course = "Биология";
}
