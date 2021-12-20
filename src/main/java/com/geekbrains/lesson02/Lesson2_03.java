package com.geekbrains.lesson02;

public class Lesson2_03 {

    public static void main(String[] args) {

        if (isNegative(-5) == true)
            System.out.println("number is negative");
        else System.out.println("number is positive");

    }

    static boolean isNegative(int a) {

        if (a < 0)
            return true;
        else return false;
    }
}
