package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int minNext = min;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x < min) {
                minNext = min;
                min = x;
            } else if (x < minNext && x != min) {
                minNext = x;
            }
        }
        System.out.println(minNext);
    }
}