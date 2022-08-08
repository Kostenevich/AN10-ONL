package lesson07.PhoneTask;

/**
 * Класс описывающий сущность мобильного телефона.
 * Содержит 3 перменные:
 * - номер телефона (выбран тип String, для записи телефона форматом +375 (29) ..)
 * - модель телефона
 * - вес телефона
 */
public class Phone {
    private String number;
    private String model;
    private int weight;

    /**
     * Геттеры и Сеттеры для каждой переменной.
     * Геттер для переменной Number - он же метод "getNumber – возвращает номер телефона" из задания.
     */

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Конструктор, принимает на вход 3 параметра (все), и вызывает конструктор с 2 параметрами
     */

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    /**
     * Конструктор, принимает на вход 2 параметра (номер и модель)
     */

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    /**
     * Пустой конструктор
     */

    public Phone() {
    }

    /**
     * Метод для принтия входящего звонка. Принимает на вход имя абонента.
     */

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    /**
     * Метод для принтия входящего звонка. Принимает на вход имя абонента и номер телефона.
     */

    public void receiveCall(String callerName, String phoneNumber) {
        receiveCall(callerName);
        System.out.println("Номер абонента: " + phoneNumber);
    }

    /**
     * Метод для отправки сообщений. Принимает на вход номера телефонов, на которые будет отправлено сообщение.
     */

    public void SendMessage(String... phoneNumber) {
        for (String element : phoneNumber) {
            System.out.println("Сообщение 'Привет' отправлено на номер:" + element);
        }
    }
}
