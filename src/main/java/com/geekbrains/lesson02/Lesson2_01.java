package com.geekbrains.lesson02;

public class Lesson2_01 {

    public static void main(String[] args) {

        isPositive(0);
    }

    static void isPositive(int a) {

        if (a < 0)
            System.out.println("number is negative");
        else System.out.println("number is positive");
    }
}
