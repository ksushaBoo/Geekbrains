package com.geekbrains.lesson01;

public class PrintColor {


    static void printColor() {

        int value = 1100;

        if (value <= 0)
            System.out.println("Color is red");
        else if (value <= 100)
            System.out.println("Color is yellow");
        else System.out.println("Color is green");
    }
}
