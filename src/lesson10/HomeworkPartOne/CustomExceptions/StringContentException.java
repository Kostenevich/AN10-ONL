package lesson10.HomeworkPartOne.CustomExceptions;

/**
 * Исключение для проверкипоследовательности abc
 */
public class StringContentException extends Exception {
    public StringContentException(String message) {
        super(message);
    }
}


