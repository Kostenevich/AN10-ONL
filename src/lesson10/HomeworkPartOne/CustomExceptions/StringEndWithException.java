package lesson10.HomeworkPartOne.CustomExceptions;

/**
 * Исключение для проверки начала строки "555"
 */

public class StringEndWithException extends Exception {
    public StringEndWithException(String message) {
        super(message);
    }
}
