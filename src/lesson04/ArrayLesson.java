package lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLesson {
    public static void main(String[] args) {

        /** Создайте массив целых чисел. Напишите программу, которая выводит сообщение о том,
         входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли (класс Scanner).
         */
        System.out.println("Задание №1");

        int[] array1 = {2, 3, 10, 25, 66};

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int userInput = sc.nextInt();

        boolean numberFound = false;

        for (int element : array1) {
            if (element == userInput) {
                numberFound = true;
            }
        }
        String message = (numberFound == true) ? "Заданное число входит в массив" : "Заданное число не входит в массив";
        System.out.println(message);

        System.out.println("-----------------------------------");

        /** Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть
         число задается с консоли (класс Scanner). Если такого числа нет – выведите сообщение
         об этом.
         */
        System.out.println("Задание №2");

        int[] array2 = {0, 4, 9, 6, 0, 2, 3, 1, 7, 5, 3};
        int arrayLength = array2.length;

        System.out.println("Введите число");
        int userInput2 = sc.nextInt();

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == userInput2) {
                arrayLength--;
            }
        }
        int[] newArray = new int[arrayLength];
        if (array2.length > arrayLength) {

            for (int i = 0, j = 0; i < array2.length; i++) {
                if (array2[i] != userInput2) {
                    newArray[j] = array2[i];
                    j++;
                }

            }
            System.out.println(Arrays.toString(newArray));

    } else {
        System.out.println("Такого числа в массиве нет");
    }

        System.out.println("-----------------------------------");

        /** Создайте и заполните массив случайными числами и выведите минимальное,
         максимальное и среднее значение. Для генерации случайного числа используйте метод
         Math.random(). Пусть будет возможность создавать массив произвольного размера. Пусть
         размер массива вводится с консоли.
         */
        System.out.println("Задание №3");

        System.out.println("Введите число");
        int userInput3 = sc.nextInt();

        int [] array3 = new int [userInput3];

        for (int i = 0; i < array3.length; i++) {
            array3 [i] = (int) (Math.random() * 90) + 10;
        }

        System.out.println(Arrays.toString(array3));

        int maxValue = array3[0];
        int minValue = array3[0];
        int sum = 0;

        for (int i = 0; i < array3.length; i++) {
            if (maxValue < array3[i]) {
                maxValue = array3[i];
            }
            if (minValue > array3[i]) {
                minValue = array3[i];
            }
            sum = sum + array3[i];
        }

        int avrValue = sum / array3.length;

        System.out.printf("Максимальное значение в массиве = %d, Минимальное значение в массиве = %d, Среднее значение = %d \n", maxValue, minValue, avrValue);

        System.out.println("-----------------------------------");

        /** Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
         Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого
         из массивов это значение оказалось больше (либо сообщите, что их средние
         арифметические равны).
         */
        System.out.println("Задание №4");

        int[] array5 = new int [5];
        int[] array6 = new int [5];

        for (int i = 0; i < array5.length; i++) {
            array5[i] = (int) (Math.random()*100);
            array6[i] = (int) (Math.random()*100);
        }

        System.out.println(Arrays.toString(array5));
        System.out.println(Arrays.toString(array6));

        int avrArray5 = 0;
        int avrArray6 = 0;

        for (int i = 0; i < array5.length; i++) {
            avrArray5 = avrArray5 + array5[i];
            avrArray6 = avrArray5 + array6[i];
        }
        avrArray5 = avrArray5 / array5.length;
        avrArray6 = avrArray6 / array5.length;

        if (avrArray5 > avrArray6) {
            System.out.printf("Среднее значение массива 5 = %d, больше среднего значения массива 6 = %d", avrArray5, avrArray6);
        }
        else if (avrArray5 < avrArray6) {
            System.out.printf("Среднее значение массива 6 = %d, больше среднего значения массива 5 = %d", avrArray6, avrArray5);
        }
        else System.out.println("Среднее арифмитическое значение двух массиво равно");


}
}







