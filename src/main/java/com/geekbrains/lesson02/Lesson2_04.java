package com.geekbrains.lesson02;

public class Lesson2_04 {

    public static void main(String[] args) {

        printLine("blabla", 7);
    }

    static void printLine(String line, int count) {

        if (count > 0)

        for (int i = 0; i < count; i++) {
            System.out.println(line);
        }
        else System.out.println("count is invalid");
    }
}
