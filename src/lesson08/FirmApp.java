package lesson08;

import lesson08.Firm.Bookkeeper;
import lesson08.Firm.Director;
import lesson08.Firm.Employee;
import lesson08.Firm.Worker;

/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который печатает название должности и
 * имплементировать этот метод в созданные классы.
 */

public class FirmApp {
    public static void main(String[] args) {
        Employee employee1 = new Director("Петр Петрович");
        Employee employee2 = new Worker("Иван Иванов");
        Employee employee3 = new Bookkeeper("Наталья Сергеевна");

        employee1.printPosition();
        employee2.printPosition();
        employee3.printPosition();


    }
}
