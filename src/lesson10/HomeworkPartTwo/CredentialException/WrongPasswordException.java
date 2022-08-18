package lesson10.HomeworkPartTwo.CredentialException;
/**
 * Исключения для неверного пароля
 */
public class WrongPasswordException extends Exception{

    public WrongPasswordException(String message) {
        super(message);
    }
    public WrongPasswordException() {
    }


}
