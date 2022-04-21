package com.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Минимальная сумма
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int sumLine = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                sumLine += array[i][j];
            }
            min = sumLine < min ? sumLine : min;
        }
        for (int i = 0; i < array.length; i++) {
            int sumColumn = 0;
            for (int j = 0; j < array.length; j++) {
                sumColumn += array[j][i];
            }
            min = sumColumn < min ? sumColumn : min;
        }
        System.out.println(min);
    }

}
