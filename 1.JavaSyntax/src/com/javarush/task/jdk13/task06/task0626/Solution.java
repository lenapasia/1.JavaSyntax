package com.javarush.task.jdk13.task06.task0626;

import java.util.Scanner;
/*
Первая база данных
*/
public class Solution {
    public static String[][] array = new String[][]{{"123", "Иванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрей"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергей"},
            {"8", "Клочкова", "Елена"},
            {"754", "Котов", "Иван"}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchText = scanner.nextLine();

        for (int i = 0; i < array.length; i++) {
            boolean findFlag = false;
            for (int j = 0; j < array[i].length; j++) {
                findFlag = !findFlag ? searchText.equals(array[i][j]) : true;
//                if (!findFlag) {
//                    findFlag = searchText.equals(array[i][j]);
//                }
            }
            if (findFlag) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + (j < array[i].length - 1 ? " " : ""));
                }
                System.out.println();
            }
        }
    }
}
