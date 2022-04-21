package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        long a;
        a = cube(3);
        System.out.println(a);
    }

    public static long cube(long a) {
        long result = a * a * a;
        return result;
    }
}
