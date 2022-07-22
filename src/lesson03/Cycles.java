package lesson03;
import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {

        /**
         При помощи цикла for вывести на экран нечетные числа от 1 до 99 (использовать инкремент)
         */
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\n");

        /**
         При помощи цикла for вывести на экран числа от 15 до 1 (использовать декремент)
         */
        for (int i = 15; i >= 1; i--) {
            System.out.print( + i + " ");
        }

        System.out.print("\n");

        /**
         Напишите программу, где пользователь вводит любое целое положительное число - N. Программа
         суммирует все числа от 1 до N. Для ввода числа используйте класс Scanner.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        int userInput = sc.nextInt();
        int sumOfNumbers = 0;

        if (userInput < 0) {
            System.out.println("Введите положительное число: ");
            userInput = sc.nextInt();
        }

        for (int i = 1; i <= userInput; i++) {
            sumOfNumbers += i;
        }
        System.out.println(sumOfNumbers);

        /**
         Напишите программу, которая будет выводить на экран такую последовательность: 7 14 21 28 35 42
         49 56 63 70 77 84 91 98 В решении использовать цикл while
         */
        int startNumber = 0;
        while (startNumber < 98) {
            startNumber += 7;
            System.out.print(startNumber + " ");
        }

        System.out.print("\n");

        /**
         Вывести 10 первых чисел последовательности 0, -5, -10, -15…
         */
        int firstNumber = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.print(firstNumber + " ");
            firstNumber -= 5;
        }

        System.out.print("\n");

        /**
         Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
         */
        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }
    }
}
