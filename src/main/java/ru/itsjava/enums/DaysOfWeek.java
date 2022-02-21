package ru.itsjava.enums;

public enum DaysOfWeek {
    Monday("Понедельник"), Tuesday("Вторник"),
    Wednesday("Среда"), Thursday("Четверг"),
    Friday("Пятница"), Saturday("Суббота"), Sunday ("Воскресенье");

    private final String translation;

    DaysOfWeek(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return this.name() +
                " - " + translation;
    }
}
