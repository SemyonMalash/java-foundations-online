package ru.itsjava.annotations;

import lombok.Getter;

@Department(name = "Кафедра прикладной математики")
@Getter
public class MathStudent {
    private String name = "Иван";
    private String surname = "Иванов";
    private String course = "Математика";
}
