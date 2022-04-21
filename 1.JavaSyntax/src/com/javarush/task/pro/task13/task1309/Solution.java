package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Иван Иванов", 5.0d);
        grades.put("Петр Петров", 5.0d);
        grades.put("Анна Анина", 5.0d);
        grades.put("Максим Максимов", 5.0d);
        grades.put("Лена Ленина", 5.0d);
    }
}
