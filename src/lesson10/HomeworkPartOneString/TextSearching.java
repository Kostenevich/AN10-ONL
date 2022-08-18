package lesson10.HomeworkPartOneString;

import java.util.Scanner;

public class TextSearching {

    /**
     * Метод для нахождения самого короткого слова в строке
     */

    public static void findShortestWord(String str) {

        String[] stringTask1Arr = str.split(" ");
        String shortWord = stringTask1Arr[0];

        for (int i = 0; i < stringTask1Arr.length; i++) {
            if (stringTask1Arr[i].length() < shortWord.length()) shortWord = stringTask1Arr[i];
        }
        System.out.println("В предложении: " + str + "\n" + "Самое короткое слово: " + shortWord);

    }

    /**
     * Метод для нахождения самого длинного слова в строке
     */

    public static void findLongestWord(String str) {

        String[] stringTask1Arr = str.split(" ");
        String longWord = stringTask1Arr[0];

        for (int i = 0; i < stringTask1Arr.length; i++) {
            if (stringTask1Arr[i].length() >= longWord.length()) longWord = stringTask1Arr[i];
        }
        System.out.println("В предложении: " + str + "\n" + "Самое длинное слово: " + longWord);

    }

    /**
     * Метод для нахождения слова с наименьшим количеством разных символов
     */

    public static void findVariousSymbols(String srt) {

        String[] stringTask2Array = srt.split(" ");
        String stringChange;

        for (String str : stringTask2Array) {
            stringChange = str;
            int counter = 0;
            for (int i = 0; i < stringChange.length() + 1; i++) {
                char symbol = stringChange.charAt(0);
                stringChange = stringChange.replaceAll(String.valueOf(symbol), "");
                counter++;
            }
            if (counter == 1) {
                System.out.println(str);
                break;
            }
        }
    }

    /**
     * Метод проверяет, является ли слово палиндромом
     */

    public static void checkPalindrome(String str) throws UserInputException {
        String[] stringTask3Arr = str.split(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int userInput = sc.nextInt();
        try {
            checkUserInput(userInput, stringTask3Arr.length);
        } catch (UserInputException e) {
            System.out.println(e.getMessage());
        }

        String checkPalindrome = stringTask3Arr[userInput - 1];
        String reverse = new StringBuilder(checkPalindrome).reverse().toString();

        String result = (reverse.equalsIgnoreCase(checkPalindrome)) ? "Слово: " + checkPalindrome + " является палиндромом" : "Слово: " + checkPalindrome + "не является палиндромом";
        System.out.println(result);
    }

    /**
     * Метод для проверки числа, которое вводим с консоли
     */

    private static void checkUserInput(int userInput, int stringLength) throws UserInputException {
        if (userInput > stringLength + 1)
            throw new UserInputException("Неподходящее число, введите число до: " + stringLength);
    }

    /**
     * Метод дублирования символов
     */

    public static void duplicateSymbols(String str) {

        StringBuilder strB = new StringBuilder();
        for (char symbols : str.toCharArray()) {
            strB.append(symbols);
            strB.append(symbols);
        }
        System.out.println(strB);

    }
}
