package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // инициализация переменной связанной с вводом из консоли
        int min = Integer.MAX_VALUE; // инициализация переменной int с максимальным значением, любое введенное число ВСЕГДА <=
        while (scanner.hasNextInt()) { // цикл с условием: пока вводятся целые числа из консоли
            int x = scanner.nextInt();// чтение целого числа из консоли в переменную х. Была ошибка - двойное чтение из консоли (int у = scanner.nextInt();)
            if (x < min) { // условие: введенное число меньше текущего минимального и в случае выполнения
                min = x;// новое минимальное значение равно введенному числу
            }
        }
        System.out.println(min);// вывод результата
    }
}