package com.javarush.task.pro.task14.task1416;

/* 
Логирование стектрейса
*/

import jdk.jfr.StackTrace;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        try {dangerousMethod();}
        catch (Exception e) {
//            StackTraceElement[] methods = e.getStackTrace();
//            System.out.println(Arrays.toString(methods));
            e.printStackTrace();
        }
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
