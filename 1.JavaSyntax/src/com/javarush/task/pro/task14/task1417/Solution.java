package com.javarush.task.pro.task14.task1417;

/* 
Валидатор даты
*/

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи дату в формате dd.mm.yyyy : ");
        String date = scanner.nextLine();
        validateDate(date);
        System.out.println("\nДата корректна.");
    }

    public static void validateDate(String date) {
        checkDateFormat(date);
        checkYearValue(date);
        checkMonthValue(date);
        checkDayValue(date);
    }

    public static void checkDateFormat(String date) {
        if (!(date.length() == 10 && date.charAt(2) == '.' && date.charAt(5) == '.')) {
            throw new InvalidDateFormatException();
        }
//        if (date.length()!=10){
//           throw new InvalidDateFormatException();
//        }
//        String subStr = date.substring(0,2);
        String  digit = date.replace(".", "");
        for (int i = 0; i < digit.length(); i++) {
            if (!Character.isDigit(digit.charAt(i))) {
                throw new InvalidDateFormatException();
            }
        }

    }

    public static void checkYearValue(String date) {
        int year = Integer.valueOf(date.substring(6));
        if (year < 1900 || year > 2100) {
            throw new InvalidYearValueException();
        }
    }

    public static void checkMonthValue(String date) {
        int month = Integer.valueOf(date.substring(3, 5));
        if (month < 1 || month > 12) {
            throw new InvalidMonthValueException();
        }
//        if (month>=1 && month<=12){
//
//        }else {
//            throw new InvalidMonthValueException();
//        }
    }

    public static void checkDayValue(String date) {
        HashMap<Integer, Integer> months = new HashMap<>() {{
            put(1, 31);
            put(2, 29);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
//        StringTokenizer tokenizer = new StringTokenizer(date,".");
        String[] strArray = (date.split("\\."));
        for(String str:strArray){
            System.out.println(str);
        }


        int day = Integer.valueOf(strArray[0]);
        int month = Integer.valueOf(strArray[1]);
        int monthDays = months.get(month);
        if (day < 1 || day > monthDays) {
                throw new InvalidDayValueException();
        }

    }
}
