package lesson10.HomeworkPartOne.CustomExceptions;

/**
 * Исключение для проверки заканчивается ли строка на "1a2b"
 */

public class StringStartWithException extends Exception {
    public StringStartWithException(String message) {
        super(message);
    }
}
