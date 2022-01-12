package com.geekbrains.lesson03;

import java.util.Arrays;

public class Lesson03 {

    public static void main(String[] args) {

        System.out.println("_____________task-1_______________");
        changeArray();

        System.out.println("_____________task-2_______________");
        printArray();

        System.out.println("_____________task-3_______________");
        multiplyArray();

        System.out.println("_____________task-4_______________");
        createTable();

        System.out.println("_____________task-5_______________");
        createArray(5, 3);

        System.out.println("_____________task-6_______________");
        maxMinValue();

        System.out.println("_____________task-7_______________");
        if (checkBalance(new int[]{10, 1, 2, 3, 4}) == true)
            System.out.println("Такое место есть");
        else System.out.println("Такого места нет");
    }

    static void changeArray() {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else arr[i] = 1;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "");
        System.out.println();
    }

    static void printArray() {

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {

            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    static void multiplyArray() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
            System.out.println(arr[i]);
        }
    }

    static void createTable() {

        int[][] table = new int[11][11];

        for (int i = 0; i < 11; i++) {
            System.out.println();
            for (int j = 0; j < 11; j++) {
                if (i == j)
                    table[i][j] = 1;
                if (j == (table.length - i - 1))
                    table[i][j] = 1;
                System.out.print(table[i][j] + " ");
            }
        }
        System.out.println();
    }

    static void createArray(int len, int initialValue) {

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void maxMinValue() {
        int[] arr = {2, 0, 3, -9, 4, 23, 34, 99, 1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("min = " + min + " max = " + max);
    }

    static boolean checkBalance(int arr[]) {

        boolean isTrue = false;

        for (int i = 0; i < arr.length - 1; i++) {
            int sumLeft = Arrays.stream(arr, 0, i + 1).sum();
            int sumRight = Arrays.stream(arr, i + 1, arr.length).sum();
            if (sumLeft == sumRight) {
                isTrue = true;
                break;
            } else isTrue = false;
        }
        return isTrue;
    }
}
