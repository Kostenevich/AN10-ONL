package lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrays {
    public static void main(String[] args) {

        /**
         Создайте трехмерный массив из целых чисел. С помощью циклов «пройти» по всему
         массиву и увеличить каждый элемент на заданное число. Пусть число, на которое будет
         увеличиваться каждый элемент, задается из консоли.
         */
        System.out.println("Задание №1");

        int[][][] multiArray = {
                {
                        {1, 1, 1},
                        {2, 2, 2},
                },
                {
                        {3, 3, 3},
                        {4, 4, 4},
                }
        };

        System.out.println(Arrays.deepToString(multiArray));

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int userInput = sc.nextInt();

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    multiArray[i][j][k] = multiArray[i][j][k] + userInput;
                }
            }
        }
        System.out.println(Arrays.deepToString(multiArray));

        System.out.println("----------------------------");

        /**
         Шахматная доска. Создайте программу для раскраски шахматной доски с помощью
         цикла. Использовать двумерный массив String размером 8х8. С помощью циклов задать
         элементам значения B (Black) или W (White).
         */
        System.out.println("Задание №2");

        String[][] chessArray = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    chessArray[i][j] = "W";
                } else chessArray[i][j] = "B";
                System.out.print(chessArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}