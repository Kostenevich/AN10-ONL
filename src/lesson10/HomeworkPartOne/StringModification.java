package lesson10.HomeworkPartOne;

import lesson10.HomeworkPartOne.CustomExceptions.StringCheckException;
import lesson10.HomeworkPartOne.CustomExceptions.StringContentException;
import lesson10.HomeworkPartOne.CustomExceptions.StringEndWithException;
import lesson10.HomeworkPartOne.CustomExceptions.StringStartWithException;

import static lesson10.HomeworkPartOne.UtilString.StringVariable.STRING_REGEX;

public class StringModification {
    /**
     * Метод для вывода на экран в одну строку два первых блока по 4 цифры.
     */

    public static void printTwoBlockOfDigits(String string) {
        System.out.println(string.substring(0, 5) + string.substring(9, 13));
    }

    /**
     * Метод для вывода на экран номер документа, но блоки из трех букв заменить на ***
     */
    public static void printWithCovertLetters(String string) {
        System.out.println(string.replaceAll("[a-zA-Z]{3}", "***"));
    }

    /**
     * Метод для вывода на экран только букв из номера документа в формате yyy/yyy/y/y в нижнем регистре.
     */
    public static void printOnlyLettersLow(String string) {
        string = string.replaceAll("(\\d{4}-)", "");
        string = string.replaceAll("(\\d)|(-\\d)", "-");
        System.out.println(string.toLowerCase());
    }

    /**
     * Метод для вывода на экран букв из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
     */
    public static void printOnlyLettersUpper(String string) {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append(string.substring(5, 9).toUpperCase()).
                append(string.substring(14, 18).toUpperCase()).
                append(string.toUpperCase().charAt(19)).
                append("-").
                append(string.toUpperCase().charAt(21));
        System.out.println("Letters:" + strBuild);

    }

    /**
     * Метод проверяет содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью)
     */
    public static void checkOnSequenceAbc(String string) throws StringContentException {
        String substring = "abc";
        if (string.toLowerCase().contains(substring.toLowerCase())) {
            System.out.println("Документ содержит последовательность abc");
        } else {
            throw new StringContentException("Документ не содержит последовательность abc");
        }
    }

    /**
     * Метод проверяет начинается ли номер документа с последовательности 555
     */
    public static void checkOnStartWithTripleFive(String string) throws StringStartWithException {
        String substring = "555";
        if (string.startsWith(substring)) {
            System.out.println("Документ начинается с 555");
        } else {
            throw new StringStartWithException("Документ не начинается на 555");
        }
    }

    /**
     * Метод проверяет заканчивается ли номер документа на последовательность 1a2b.
     */
    public static void checkOnEndWithTripleFive(String string) throws StringEndWithException {
        String substring = "1a2b";
        if (string.endsWith(substring)) {
            System.out.println("Документ заканчивается на 1a2b");
        } else {
            throw new StringEndWithException("Документ не заканчивается на 1a2b");
        }

    }

    protected static void checkString(String string) throws StringCheckException {
        if (string.matches(STRING_REGEX)) {
            System.out.println("Номер документа: " + string);
        } else {
            throw new StringCheckException("Неверный формат документа");
        }
    }

}
