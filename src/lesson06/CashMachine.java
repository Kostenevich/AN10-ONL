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

    public boolean isPossibleToWithdrawMoney(int withdrawMoney) {
        printSumForWithdraw(withdrawMoney);

        if (withdrawMoney % 10 != 0) {
            printErrorMessage();
            return false;
        }
        return isPossibleToPrintMoney(withdrawMoney);
    }

    public boolean isPossibleToPrintMoney(int withdrawMoney) {
        int countOfBanknotes20toIssuance = countOfBanknotes20;
        int countOfBanknotes50toIssuance = countOfBanknotes50;
        int countOfBanknotes100toIssuance = countOfBanknotes100;
        int checkSum;

        while (withdrawMoney > 0) {
            checkSum = withdrawMoney;
            if (withdrawMoney >= 50 && withdrawMoney % 20 != 0 && countOfBanknotes50toIssuance > 0) {
                withdrawMoney -= 50;
                countOfBanknotes50toIssuance--;
            }
            if (withdrawMoney >= 100 && countOfBanknotes100toIssuance > 0) {
                withdrawMoney -= 100;
                countOfBanknotes100toIssuance--;
            }
            if (withdrawMoney >= 20 && countOfBanknotes20toIssuance > 0) {
                withdrawMoney -= 20;
                countOfBanknotes20toIssuance--;
            } else if (withdrawMoney >= 50 && countOfBanknotes50toIssuance > 0 && withdrawMoney % 50 == 0) {
                withdrawMoney -= 50;
                countOfBanknotes50toIssuance--;
            }
            if (checkSum == withdrawMoney) {
                printErrorMessage();
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

    public void printSumForWithdraw(int printSum) {
        System.out.println("Сумма для выдачи: " + printSum);
    }

    public void printErrorMessage() {
        System.out.println("Невозможно выдать такую сумму" + "\n");
    }
}

