package lesson10.HomeworkPartTwo;

import lesson10.HomeworkPartTwo.CredentialException.WrongLoginException;
import lesson10.HomeworkPartTwo.CredentialException.WrongPasswordException;

import static lesson10.HomeworkPartTwo.UtilCredential.CredentialVariable.LOGIN_REGEX;
import static lesson10.HomeworkPartTwo.UtilCredential.CredentialVariable.PASSWORD_REGEX;

public class Credential {

    public static boolean checkCredential(String login, String password, String confirmPassword) {
        System.out.println("Логин: " + login + "\n" + "Пароль: " + password + "\n" + "Повторный пароль: " + confirmPassword);
        try {
            boolean b = isLoginValid(login) && isPasswordValid(password) && isPasswordsMatch(password, confirmPassword);
            System.out.println("Авторизация прошла успешно");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    private static boolean isLoginValid(String login) throws WrongLoginException {
        if (!login.matches(LOGIN_REGEX)) {
            throw new WrongLoginException("Логин не удовлетворяет условиям");
        }
        return true;
    }

    private static boolean isPasswordValid(String password) throws WrongPasswordException {
        if (!password.matches(PASSWORD_REGEX)) {
            throw new WrongPasswordException("Пароль не удовлетворяет условиям");
        }
        return true;
    }

    private static boolean isPasswordsMatch(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}
