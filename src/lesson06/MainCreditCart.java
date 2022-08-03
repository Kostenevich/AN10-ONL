package lesson06;

public class MainCreditCart {
    public static void main(String[] args) {
        /**
         Домашнее задание. Часть #1
         Создать класс CreditCard c полями номер счета, текущая сумма на счету.
         Добавьте метод, который позволяет начислять сумму на кредитную карточку.
         Добавьте метод, который позволяет снимать с карточки некоторую сумму.
         Добавьте метод, который выводит текущую информацию о карточке.
         Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
         Тестовый сценарий для проверки:
         Положите деньги на первые две карточки и снимите с третьей.
         */

        CreditCard creditCard1 = new CreditCard(123, 500);
        CreditCard creditCard2 = new CreditCard(456, 500);
        CreditCard creditCard3 = new CreditCard(789, 500);

        creditCard1.refillBalance(100);
        creditCard2.refillBalance(120);
        creditCard3.withdrawBalance(20);

        System.out.println(creditCard1.getCreditCardInfo());
        System.out.println(creditCard2.getCreditCardInfo());
        System.out.println(creditCard3.getCreditCardInfo());

    }
}
