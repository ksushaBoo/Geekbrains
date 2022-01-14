package com.geekbrains.lesson04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KrestiNuli2 {

    private final static int SIZE = 3;
    private final static char DOT_EMPTY = '.';
    private final static char DOT_X = 'X';
    private final static char DOT_O = 'O';
    private final static char[][] MAP = new char[SIZE][SIZE];
    private final static Scanner SCANNER = new Scanner(System.in);
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил ИИ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
            }

        }

        System.out.println("Игра закончена");
        SCANNER.close();

    }

    private static boolean checkWin(char symbol) {

        char[] resultLine = new char[SIZE];
        char[] resultMainDiagonal = new char[SIZE];
        char[] resultSecondDiagonal = new char[SIZE];
        char[] winAResult = new char[SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                resultLine[j] = MAP[i][j];
                winAResult[j] = symbol;
                if (i + j == SIZE - 1) {
                    resultSecondDiagonal[j] = MAP[i][j];
                }
                if (i == j) {
                    resultMainDiagonal[j] = MAP[i][j];
                }
            }
            if (Arrays.equals(resultLine, winAResult) || Arrays.equals(resultMainDiagonal, winAResult) || Arrays.equals(resultSecondDiagonal, winAResult))
                return true;
        }
        return false;
    }

    private static boolean isMapFull() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                if (MAP[i][j] == DOT_EMPTY)
                    return false;
        }
        return true;
    }

    private static void aiTurn() {
        int x;
        int y;

        do {
            do {
                x = RANDOM.nextInt(SIZE);
                y = RANDOM.nextInt(SIZE);
            } while (!blockHumanTurn(x, y));
        }
        while (!isCellValid(x, y));

        MAP[y][x] = DOT_O;
    }

    private static boolean blockHumanTurn(int x, int y) {

        int countLine = 0;
        int countMain = 0;
        int countSecond = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((i + j == SIZE - 1) && (MAP[i][j] == DOT_X) && (x + y == i + j)) {
                    countSecond++;
                    if (countSecond > 1)
                    return true;
                }
                if ((i == j) && (MAP[i][j] == DOT_X) && (x == y)) {
                    countMain++;
                    if (countMain > 1)
                        return true;
                }
                if ((MAP[i][j] == DOT_X) && (y == i)) {
                    countLine++;
                    if (countLine > 1)
                        return true;
                }
            }
            countLine = 0;
        }
        return false;
    }

//    private static void aiTurn() {
//        int x;
//        int y;
//
//        do {
//            x = RANDOM.nextInt(SIZE);
//            y = RANDOM.nextInt(SIZE);
//        }
//        while (!isCellValid(x, y));
//
//        MAP[y][x] = DOT_O;
//    }

    private static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты в формате Х и У");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));

        MAP[y][x] = DOT_X;
    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
            return false;
        if (MAP[y][x] == DOT_EMPTY)
            return true;

        return false;
    }

    private static void initMap() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                MAP[i][j] = DOT_EMPTY;
        }
    }

    private static void printMap() {

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

