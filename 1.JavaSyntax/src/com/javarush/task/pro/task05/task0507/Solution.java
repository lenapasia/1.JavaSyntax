package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            int a = array[j];
            if (a > max) {
                max = array[j];
            }
        }
        System.out.println(max);
    }
}
