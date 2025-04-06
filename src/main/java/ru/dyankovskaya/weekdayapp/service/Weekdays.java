package ru.dyankovskaya.weekdayapp.service;

public enum Weekdays {
    MONDAY("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота"),
    SUNDAY ("Воскресенье");

    private String russianName;

    Weekdays(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }


}
