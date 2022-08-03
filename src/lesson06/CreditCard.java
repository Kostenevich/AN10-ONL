package lesson06;

public class CreditCard {
    int accountNumber;
    int currentBalance;

    public CreditCard(int accountNumber, int currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public CreditCard() {
    }

    public void refillBalance(int amountOfDeposit) {
        currentBalance += amountOfDeposit;
    }

    public void withdrawBalance(int amountOfWithdraw) {
        if (isBalancePositive(amountOfWithdraw)) {
            currentBalance -= amountOfWithdraw;
        }
    }

    public String getCreditCardInfo() {
        return "Номер счета: " + accountNumber + "\nТекущая сумма на счету: " + currentBalance;
    }

    public boolean isBalancePositive(int amountOfWithdraw) {
        return currentBalance > amountOfWithdraw;
    }
}
