package lesson10.HomeworkPartTwo.CredentialException;

public class WrongLoginException extends Exception{

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}
