package lesson06;

public class MainCashMachine {
    public static void main(String[] args) {
        /**
         Необязательная часть #2
         Создать класс, описывающий банкомат.
         Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
         количеством купюр номиналом 20, 50 и 100
         Сделать метод для добавления денег в банкомат.
         Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение
         - успешность выполнения операции.
         При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся
         сумма.
         Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
         */

        CashMachine cashMachine1 = new CashMachine(6, 1, 1);
        cashMachine1.addMoneyToCashMachine(0, 0, 0);

        cashMachine1.isPossibleToWithdrawMoney(51);
        cashMachine1.isPossibleToWithdrawMoney(10);
        cashMachine1.isPossibleToWithdrawMoney(30);
        cashMachine1.isPossibleToWithdrawMoney(130);
        cashMachine1.isPossibleToWithdrawMoney(120);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addMoneyToCashMachine(5, 3, 1);

        cashMachine2.isPossibleToWithdrawMoney(150);
        cashMachine2.isPossibleToWithdrawMoney(200);
    }
}
