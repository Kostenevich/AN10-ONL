package lesson03;

public class ControlStructure {
    public static void main(String[] args) {

        /**
         Написать программу для вывода времени года по номеру месяца.
         Должно быть 2 варианта реализации: switch-case и if-else-if
         (Номер месяца можно либо явно задать в коде, либо вводить из консоли)
         */
        int numberOfMonth = 11;

        //Реализация switch-case
        switch (numberOfMonth) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Введите корректный номер месяца");
        }

        //Реализация if - else - if
        if (numberOfMonth == 1) {
            System.out.println("Январь");
        }
        else if (numberOfMonth == 2) {
            System.out.println("Февраль");
        }
        else if (numberOfMonth == 3) {
            System.out.println("Март");
        }
        else if (numberOfMonth == 4) {
            System.out.println("Апрель");
        }
        else if (numberOfMonth == 5) {
            System.out.println("Май");
        }
        else if (numberOfMonth == 6) {
            System.out.println("Июнь");
        }
        else if (numberOfMonth == 7) {
            System.out.println("Июль");
        }
        else if (numberOfMonth == 8) {
            System.out.println("Август");
        }
        else if (numberOfMonth == 9) {
            System.out.println("Сентябрь");
        }
        else if (numberOfMonth == 10) {
            System.out.println("Октябрь");
        }
        else if (numberOfMonth == 11) {
            System.out.println("Ноябрь");
        }
        else if (numberOfMonth == 12) {
            System.out.println("Декабрь");
        }
        else {
            System.out.println("Введите корректный номер месяца");
        }

        /**
         Напишите программу, которая будет принимать на вход число
         (можно задать явно в коде) и на выход будет выводить сообщение о четности числа.
         */
        int inputNumber = 7;
        if (inputNumber % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }

        /**
         Для числа t (температура на улице) вывести:
         Если t > 15, то вывести «Тепло»
         Если t <= 15 и t > 5, то вывести «Нормально»
         Если t <= 5, то вывести «Холодно»
         */
        int t = -7;
        if (t > 15) {
            System.out.println("Тепло");
        }
        if (t <= 15 && t > 5) {
            System.out.println("Нормально");
        }
        if (t <= 5) {
            System.out.println("Холодно");
        }

        /**
         По введенному (можно задать явно) номеру определить цвет радуги (1 – красный, 4 – зеленый и т.д.)
         */
        int numberOfColorRainbow = -1;
        switch (numberOfColorRainbow) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Введите число от 1 до 7, чтобы узанть цвет радуги");
        }
    }
}

