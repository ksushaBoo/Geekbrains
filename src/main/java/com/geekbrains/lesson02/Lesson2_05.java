package com.geekbrains.lesson02;

public class Lesson2_05 {

    public static void main(String[] args) {

        if (isYearBissextile(2016) == true)
            System.out.println("год високосный");
        else System.out.println("год не високосный");
    }

    static boolean isYearBissextile(int year) {

        if (year % 4 == 0) {
            if (year % 400 == 0)
                return true;
            else if (year % 100 == 0)
                return false;
            else return true;
        }
        return false;
    }
}
