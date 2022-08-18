package lesson10.HomeworkPartOne.CustomExceptions;

/**
 * Исключение для проверки содержит ли строка последовательность abc
 */

public class StringContentException extends Exception {
    public StringContentException(String message) {
        super(message);
    }
}


