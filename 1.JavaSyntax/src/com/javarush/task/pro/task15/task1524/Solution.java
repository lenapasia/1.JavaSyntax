package com.javarush.task.pro.task15.task1524;

import java.io.*;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String inputFilePath = console.nextLine();
        String outputFilePath = console.nextLine();


//        String src = "C:\JavaRush\HomeWork\Lesson24\switchbyte.txt";
//        String dest = "C:\JavaRush\HomeWork\Lesson24\switchbyte2.txt";

        try (InputStream input = new FileInputStream(inputFilePath);
             OutputStream output = new FileOutputStream(outputFilePath)) {
            byte[] buffer = new byte[2];
            while (input.available() > 0) {
                int real = input.read(buffer);
                byte[] outBuffer = new byte[real];
                if (real == 2) {
                    outBuffer[0] = buffer[1];
                    outBuffer[1] = buffer[0];
                } else {
                    outBuffer[0] = buffer[0];
                }
                output.write(outBuffer, 0, real);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}