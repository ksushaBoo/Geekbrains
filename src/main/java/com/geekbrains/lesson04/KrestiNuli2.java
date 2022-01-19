package com.geekbrains.lesson04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KrestiNuli2 {

    private final static int SIZE = 4;
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
        char[] resultColumn = new char[SIZE];
        char[] resultMainDiagonal = new char[SIZE];
        char[] resultSecondDiagonal = new char[SIZE];
        char[] winAResult = new char[SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                resultLine[j] = MAP[i][j]; // Складываем все  символы в текущей линии в отдельный массив
                resultColumn[j] = MAP[j][i]; // Складываем все  символы в текущем стобце в отдельный массив
                winAResult[j] = symbol; // Заполняем массив символами для сверки победы массив Х или О
                if (i + j == SIZE - 1) {
                    resultSecondDiagonal[j] = MAP[i][j]; // Складываем все  символы в  побочной диагонали в отдельный массив
                }
                if (i == j) {
                    resultMainDiagonal[j] = MAP[i][j]; // Складываем все  символы в  главной диагонали в отдельный массив
                }
            }
            if (Arrays.equals(resultLine, winAResult) || (Arrays.equals(resultColumn, winAResult))
                    || Arrays.equals(resultMainDiagonal, winAResult) || Arrays.equals(resultSecondDiagonal, winAResult))
                return true; // Сравниваем все возможные победные коомбинации с массивом выгрышных символоы
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
        int x = 0;
        int y = 0;
        boolean aiWin = false;
        boolean userWin = false;

        //Проверяем возможен ли победный ход для ИИ: проходим по всему полю, в валидные  ячейки ставим О
        // и делаем проверку победы, Если победа, то сохряняем х и у
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(j, i)) {
                    MAP[i][j] = DOT_O;
                    if (checkWin(DOT_O)) {
                        x = j;
                        y = i;
                        aiWin = true;
                    }
                    MAP[i][j] = DOT_EMPTY;
                }
            }
        }

//        Проверяем возможность заблокировать игрока. Проходим по всем валидным ячейкам и заполняем их Х, проверяем победу.
//        Если победа состоялась, то запоминаем х и у
        if (!aiWin) {
            for (int i = 0; i < SIZE; i++)
                for (int j = 0; j < SIZE; j++) {
                    if (isCellValid(j, i)) {
                        MAP[i][j] = DOT_X;
                        if (checkWin(DOT_X)) {
                            x = j;
                            y = i;
                            userWin = true;
                        }
                        MAP[i][j] = DOT_EMPTY;
                    }
                }
        }

        if (!aiWin && !userWin) {
            do {
                x = RANDOM.nextInt(SIZE);
                y = RANDOM.nextInt(SIZE);
            }
            while (!isCellValid(x, y));
        }

        MAP[y][x] = DOT_O;
    }


    private static void humanTurn() {
        int x;
        int y;
        int count = 0;

        do {
            System.out.println("Введите координаты в формате Х и У");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));

        count++;
        MAP[y][x] = DOT_X;
        System.out.println("Ход номер " + count);
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

