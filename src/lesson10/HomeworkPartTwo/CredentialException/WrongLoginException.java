package lesson10.HomeworkPartTwo.CredentialException;

/**
 * Исключения для неверного логина
 */

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}
