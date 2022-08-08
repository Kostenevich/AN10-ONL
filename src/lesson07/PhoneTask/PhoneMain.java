package lesson07.PhoneTask;

public class PhoneMain {
    public static void main(String[] args) {
        /**
         Задание №1
         Класс Phone.
         Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого
         класса. Выведите на консоль значения их переменных.
         Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль
         сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из
         объектов.
         Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
         переменных класса - number, model и weight.
         Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
         number, model.
         Добавить конструктор без параметров.
         Вызвать из конструктора с тремя параметрами конструктор с двумя.
         Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер
         телефона звонящего.
         Вызвать этот метод.
         Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
         телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
         */

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.setModel("Apple");
        phone1.setNumber("+375-(29)-111-22-33");
        phone1.setWeight(170);

        phone2.setModel("Samsung");
        phone2.setNumber("+375-(25)-222-33-44");
        phone2.setWeight(120);

        phone3.setModel("Xiaomi");
        phone3.setNumber("+375-(33)-333-44-55");
        phone3.setWeight(130);

        System.out.println(phone1.getModel() + "\n" + phone1.getNumber() + "\n" + phone1.getWeight());
        System.out.println(phone2.getModel() + "\n" + phone2.getNumber() + "\n" + phone2.getWeight());
        System.out.println(phone3.getModel() + "\n" + phone3.getNumber() + "\n" + phone3.getWeight());

        phone1.receiveCall("Надя");
        System.out.println(phone1.getNumber());

        phone2.receiveCall("Женя");
        System.out.println(phone1.getNumber());

        phone3.receiveCall("Петя");
        System.out.println(phone1.getNumber());

        Phone phone4 = new Phone("+375-(29)-123-45-67", "Nokia", 150);


        phone1.receiveCall("Надя", "+375-(29)-362-92-99");
        phone2.receiveCall("Не брать", "+375-(29)-999-66-67");
        phone3.receiveCall("Петя", "+375-(29)-111-22-33");

        phone1.SendMessage("+375-(29)-362-92-99", "+375-(29)-399-99-99");
        phone2.SendMessage("+375-(29)-362-92-99", "+375-(29)-399-99-99");
        phone3.SendMessage("+375-(29)-362-92-99", "+375-(29)-399-99-99");
        phone4.SendMessage("+375-(29)-362-92-99", "+375-(29)-399-99-99");


    }
}
