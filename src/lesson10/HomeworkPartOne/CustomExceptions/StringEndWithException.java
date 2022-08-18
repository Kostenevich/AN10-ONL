package lesson10.HomeworkPartOne.CustomExceptions;

/**
 * Исключение для проверки начинается ли строка с "555"
 */

public class StringEndWithException extends Exception {
    public StringEndWithException(String message) {
        super(message);
    }
}
