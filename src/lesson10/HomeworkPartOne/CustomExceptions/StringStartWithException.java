package lesson10.HomeworkPartOne.CustomExceptions;

/**
 * Исключение для проверки окончания строки на "1a2b"
 */

public class StringStartWithException extends Exception {
    public StringStartWithException(String message) {
        super(message);
    }
}
