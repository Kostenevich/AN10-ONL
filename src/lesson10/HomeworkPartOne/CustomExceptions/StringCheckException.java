package lesson10.HomeworkPartOne.CustomExceptions;

/**
 * Исключение для проверки формата передоваймой строки
 */
public class StringCheckException extends Exception {
    public StringCheckException(String message) {
        super(message);
    }
}

