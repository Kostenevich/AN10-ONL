package lesson10.HomeworkPartOneString;

/**
 * 1. Дана строка произвольной длины с произвольными словами.
 * Найти самое короткое слово в строке и вывести его на экран.
 * Найти самое длинное слово в строке и вывести его на экран. Если таких слов несколько, то вывести последнее из них.
 * 2. Дана строка произвольной длины с произвольными словами.
 * Найти слово, в котором число различных символов минимально.
 * Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
 * Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 * 3. Дана строка произвольной длины с произвольными словами.
 * Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
 * Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке палиндромом.
 * Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
 * например, в строке 5 слов, а на вход программе передали число 500 и т. п. ситуации.
 * 4. Дана произвольная строка. Вывести на консоль новую строку, которой задублирована каждая буква из
 * начальной строки. Например, "Hello" -> "HHeelllloo".
 */

public class PartOneStringApp {
    public static void main(String[] args) throws UserInputException {
        System.out.println("Задание №1");
        String stringTask1 = "Один два три семь";
        TextSearching.findShortestWord(stringTask1);
        TextSearching.findLongestWord(stringTask1);

        System.out.println("-----------------------------");

        System.out.println("Задание №2");
        String stringTask2 = "fffff ab f 1234 jkjk";
        TextSearching.findVariousSymbols(stringTask2);

        System.out.println("-----------------------------");

        System.out.println("Задание №3");
        String stringTask3 = "Мадам дед роза макароны кабак";
        TextSearching.checkPalindrome(stringTask3);

        System.out.println("-----------------------------");
        System.out.println("Задание №3");
        String stringTask4 = "hello!";
        TextSearching.duplicateSymbols(stringTask4);

    }
}
