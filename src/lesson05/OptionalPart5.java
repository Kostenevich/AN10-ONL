package lesson05;

import java.util.Arrays;

public class OptionalPart5 {
    public static void main(String[] args) {

        /**
         Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите
         программу для умножения двух матриц.
         Тестовые данные:
         первый массив {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}}
         второй массив {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}}
         результат: {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}}
         */
        System.out.println("Задание №2.1");

        int[][] matrix1 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] matrix2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };

        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1.length; j++) {
                int sum = 0;

                for (int k = 0; k < matrix3.length; k++) {
                    sum = sum + (matrix1[i][k] * matrix2[k][j]);
                    matrix3[i][j] = sum;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix3));

        System.out.println("------------------------------------");

        /**
         Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов.
         */
        System.out.println("Задание №2.2");

        int[][] array = {
                {10, 10, 10, 10},
                {-20, -20},
                {22, -11, -11}
        };

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println(sum);

        System.out.println("----------------");

        /**
         Создайте двумерный массив. Выведите на консоль диагонали массива.
         */
        System.out.println("Задание №2.3");

        int[][] array2 = {
                {1, 0, 0, 0, 0, 2},
                {0, 1, 0, 0, 2, 0},
                {0, 0, 1, 2, 0, 0},
                {0, 0, 2, 1, 0, 0},
                {0, 2, 0, 0, 1, 0},
                {2, 0, 0, 0, 0, 1},

        };

        for (int i = 0, j = 0; i < array2.length; i++, j++) {
            System.out.print(array2[i][j]);
        }
        System.out.println();

        for (int i = 0, j = array2[i].length - 1; i < array2.length; i++, j--) {
            System.out.print(array2[i][j]);
        }

        System.out.println("\n --------");

        /**
         Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по
         возрастанию.
         */

        System.out.println("Задание №2.4");

        int[][] array3 = new int[5][6];

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("Изначальный массив: \n" + Arrays.deepToString(array3));

        for (int i = 0; i < array3.length; i++) {
            Arrays.sort(array3[i]);
        }

        System.out.println("Отсортированный массив: \n" + Arrays.deepToString(array3));
    }
}

