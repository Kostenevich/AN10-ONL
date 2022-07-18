package lesson03;

import java.util.Scanner;

public class OptionalPart {
    public static void main(String[] args) {

        /**
         Выведите на экран первый 11 членов последовательности Фибоначчи
         */
        var currentNumber = 0;
        var nextNumber = 1;

        for (int i = 0; i < 11; i++) {
            System.out.print(currentNumber + " ");
            var sum = currentNumber + nextNumber;
            currentNumber = nextNumber;
            nextNumber = sum;
        }

        //Второй вариант решения. В задани указано ВЫВЕСТИ числа на экран :)
        System.out.println("\n" + "0 1 1 2 3 5 8 13 21 34 55");

        /**
         За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу, в которую
         пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада
         с учетом начисления процентов за каждый месяц. Для вычисления суммы с учетом процентов
         используйте цикл for.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму депозита: ");
        float deposit = sc.nextFloat();

        System.out.println("Укажите срок депозита: ");
        int countOfDepositMonth = sc.nextInt();

        float percentValue = 0;

        for (int i = 0; i < countOfDepositMonth; i++) {
            percentValue = ((deposit * 7) / 100);
            deposit = deposit + percentValue;

        }
        System.out.println(deposit);

        /**
         * Напишите программу, которая выводит в консоль таблицу умножения.
         */
        System.out.print("   ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
           if (i < 10) {
                System.out.print(i + "  ");
           } else {
                System.out.print(i + " ");
           }
            for (int x = 1; x <= 10; x++) {
                int res = i * x;
                System.out.print(res);
                if (res >= 10) {
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}

