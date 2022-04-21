package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { //внешний цикл со строками всего 10 строк
            int eight = 0 + i;//задаю количество "8" в строке
            for (int b = 0; b <= eight; b++) {
                System.out.print("8");
            }
            System.out.println(); // перенос курсора на следующую строку
        }
    }
}