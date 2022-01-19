package com.geekbrains.lesson02;

public class Lesson2_02 {

    public static void main(String[] args) {

        System.out.println(checkSum(0,100));
    }

    static boolean checkSum(int a, int b) {

        int sum = a + b;
        boolean isTrue;

        if (sum >= 10 && sum <= 20) return true;
        else {
            return false;
        }
    }
}
