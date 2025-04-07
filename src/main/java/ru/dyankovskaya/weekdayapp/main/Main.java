package ru.dyankovskaya.weekdayapp.main;

import ru.dyankovskaya.weekdayapp.service.Weekdays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String engWeekday = sc.nextLine();

       System.out.println(Weekdays.translateWeekdays(engWeekday));
    }  
}