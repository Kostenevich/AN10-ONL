package lesson10.HomeworkPartOne;

import lesson10.HomeworkPartOne.CustomExceptions.StringCheckException;
import lesson10.HomeworkPartOne.CustomExceptions.StringContentException;
import lesson10.HomeworkPartOne.CustomExceptions.StringEndWithException;
import lesson10.HomeworkPartOne.CustomExceptions.StringStartWithException;

/**
 * Написать программу со следующим функционалом:
 * На вход передать строку (будем считать, что это номер документа).
 * Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
 * - Вывести на экран в одну строку два первых блока по 4 цифры.
 * - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
 * - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
 * - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
 * - Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 * - Проверить начинается ли номер документа с последовательности 555
 * - Проверить заканчивается ли номер документа на последовательность 1a2b.
 * Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром) будут принимать вводимую на вход программы строку.
 * Также надо создать свои классы исключений на каждую ситуацию:
 * - Проверить содержит ли номер документа последовательность abc.
 * - Проверить начинается ли номер документа с последовательности 555
 * - Проверить заканчивается ли номер документа на последовательность 1a2b.
 * Если номер документа не удовлетворяет условию - то "бросить" исключение.
 * В методе класса, в котором будут вызываться эти методы для демонстрации работы, перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение для
 * пользователя (сообщение на консоль).
 */

public class PartOneApp {

    public static void main(String[] args) {
        /**
         Две строки для проверки
         */
        String s1 = "1111-ABC-5555-fDf-1a2b";
        String s2 = "111-ABC-5555-fDf-112b";

        try {
            StringModification.checkString(s2);
        } catch (StringCheckException e) {
            System.out.println(e.getMessage());
            return;
        }

        StringModification.printTwoBlockOfDigits(s1);
        StringModification.printWithCovertLetters(s1);
        StringModification.printOnlyLettersLow(s1);
        StringModification.printOnlyLettersUpper(s1);

        try {
            StringModification.checkOnSequenceAbc(s1);
        } catch (StringContentException e) {
            System.out.println(e.getMessage());
        }

        try {
            StringModification.checkOnStartWithTripleFive(s1);
        } catch (StringStartWithException e) {
            System.out.println(e.getMessage());
        }

        try {
            StringModification.checkOnEndWithTripleFive(s1);
        } catch (StringEndWithException e) {
            System.out.println(e.getMessage());
        }
    }

}
