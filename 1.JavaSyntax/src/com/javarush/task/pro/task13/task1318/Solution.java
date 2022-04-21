package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        int index = month.ordinal();
        int indexNext = index + 1;
        Month[] values = Month.values();
        if (indexNext >= values.length) {
            indexNext = 0;
        }
        return values[indexNext];
    }


}