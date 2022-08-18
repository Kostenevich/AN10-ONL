package lesson10.HomeworkPartTwo.UtilCredential;

/**
 * Длина login должна быть меньше 20 символов и не должен содержать пробелы.
 * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
 */

public class CredentialVariable {
    public static final String LOGIN_REGEX = "[^\\s][A-Za-z\\d]{20,}$";
    public static final String PASSWORD_REGEX = "(?=.*\\d)[^\\s][A-Za-z\\d]{20,}$";
}
