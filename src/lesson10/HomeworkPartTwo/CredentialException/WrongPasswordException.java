package lesson10.HomeworkPartTwo.CredentialException;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(String message) {
        super(message);
    }
    public WrongPasswordException() {
    }


}
