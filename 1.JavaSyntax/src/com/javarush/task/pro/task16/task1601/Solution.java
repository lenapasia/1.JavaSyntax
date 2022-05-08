package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(91, 8, 7);
    ;

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String dayRus = "";
        int day = date.getDay();
//        if (day == 1) {
//            dayRus = "понедельник";
//        } else if (day == 2) {
//            dayRus = "вторник";
//        } else if (day == 3) {
//            dayRus = "среда";
//        } else if (day == 4) {
//            dayRus = "четверг";
//        } else if (day == 5) {
//            dayRus = "пятница";
//        } else if (day == 6) {
//            dayRus = "суббота";
//        } else if (day == 0) {
//            dayRus = "восресенье";
//        }
        switch (day) {
            case 0:
                return "воскресенье";
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
        }
        return dayRus;
    }
}
