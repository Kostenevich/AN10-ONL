package lesson06;

public class CashMachine {

    int countOfBanknotes20;
    int countOfBanknotes50;
    int countOfBanknotes100;

    public CashMachine(int countOfBanknotes20, int countOfBanknotes50, int countOfBanknotes100) {
        this.countOfBanknotes20 = countOfBanknotes20;
        this.countOfBanknotes50 = countOfBanknotes50;
        this.countOfBanknotes100 = countOfBanknotes100;
    }

    public CashMachine() {
    }

    public void addMoneyToCashMachine(int countOfBanknotes20, int countOfBanknotes50, int countOfBanknotes100) {
        this.countOfBanknotes20 += countOfBanknotes20;
        this.countOfBanknotes50 += countOfBanknotes50;
        this.countOfBanknotes100 += countOfBanknotes100;
    }

    public boolean isPossibleToWithdrawMoney(int withdrawCash) {
        System.out.println("Сумма для выдачи: " + withdrawCash);

        if ((withdrawCash < 20 || withdrawCash == 30)) {
            System.out.println("Не имеется нужной суммы для выдачи\n");
            return false;
        }
        if (withdrawCash % 10 != 0) {
            System.out.println("Не имеется нужной суммы для выдачи\n");
            return false;
        }

        int countOfBanknotes20toIssuance = countOfBanknotes20;
        int countOfBanknotes50toIssuance = countOfBanknotes50;
        int countOfBanknotes100toIssuance = countOfBanknotes100;
        int checkSum;

        while (withdrawCash > 0) {
            checkSum = withdrawCash;
            if (withdrawCash % 20 != 0 && countOfBanknotes50toIssuance > 0) {
                withdrawCash -= 50;
                countOfBanknotes50toIssuance--;
            }
            if (withdrawCash >= 100 && countOfBanknotes100toIssuance > 0) {
                withdrawCash -= 100;
                countOfBanknotes100toIssuance--;
            }
            if (withdrawCash >= 20 && countOfBanknotes20toIssuance > 0) {
                withdrawCash -= 20;
                countOfBanknotes20toIssuance--;
            } else if (withdrawCash >= 50 && countOfBanknotes50toIssuance > 0 && withdrawCash % 50 == 0) {
                withdrawCash -= 50;
                countOfBanknotes50toIssuance--;
            }
            if (checkSum == withdrawCash) {
                System.out.println("Не имеется нужной суммы для выдачи\n");
                return false;
            }
        }
        System.out.println("Выдано 20 BYN: " + (countOfBanknotes20 - countOfBanknotes20toIssuance));
        System.out.println("Выдано 50 BYN: " + (countOfBanknotes50 - countOfBanknotes50toIssuance));
        System.out.println("Выдано 100 BYN: " + (countOfBanknotes100 - countOfBanknotes100toIssuance) + "\n");
        countOfBanknotes20 = countOfBanknotes20toIssuance;
        countOfBanknotes50 = countOfBanknotes50toIssuance;
        countOfBanknotes100 = countOfBanknotes100toIssuance;

        return true;
    }
}

