package lesson10.HomeworkPartTwo;

import lesson10.HomeworkPartTwo.CredentialException.WrongLoginException;
import lesson10.HomeworkPartTwo.CredentialException.WrongPasswordException;

public class CredApp {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        String login = "naaaaaaaaaddddyyyyaaaa1";
        String password = "qwerty1qwertyqwertyqwerty";
        String confirmPassword = password;

        String login1 = "nadya1234567891234567";
        String password1 = "qwerty1qwertyqwertyqwerty";
        String confirmPassword1 = "qwerty1qwertyqwerty";

        String login2 = "nadya12";
        String password2 = "qwerty1qwertyqwertyqwerty";
        String confirmPassword2 = password2;

        String login3 = "nadya1234567891234567";
        String password3 = "qwertyqwertyqwertyqwerty";
        String confirmPassword3 = password3;

        Credential.checkCredential(login, password, confirmPassword);
        System.out.println("------------------------");
        Credential.checkCredential(login1, password1, confirmPassword1);
        System.out.println("------------------------");
        Credential.checkCredential(login2, password2, confirmPassword2);
        System.out.println("------------------------");
        Credential.checkCredential(login3, password3, confirmPassword3);

    }
}
