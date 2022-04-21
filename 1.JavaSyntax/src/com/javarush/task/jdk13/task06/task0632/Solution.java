package com.javarush.task.jdk13.task06.task0632;


import java.io.IOException;
import java.util.Scanner;

/* 
Пирамида
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        array = new char[h][2 * h - 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((j > array[i].length / 2 - 1 - i) && (j < array[i].length / 2 + 1 + i)) ? '#' : ' ';
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}




















































