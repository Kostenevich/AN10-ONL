package lesson08.Registration.Document;

import java.util.Date;

public class Invoice extends Documents {
    private double finalSum;
    private int codeOfDepartment;

    public Invoice(Date dateOfDocument, int numberOfDocument, double finalSum, int codeOfDepartment) {
        super(dateOfDocument, numberOfDocument);
        this.finalSum = finalSum;
        this.codeOfDepartment = codeOfDepartment;
    }

    public Invoice() {

    }

    public double getFinalSum() {
        return finalSum;
    }

    public void setFinalSum(double finalSum) {
        this.finalSum = finalSum;
    }

    public int getCodeOfDepartment() {
        return codeOfDepartment;
    }

    public void setCodeOfDepartment(int codeOfDepartment) {
        this.codeOfDepartment = codeOfDepartment;
    }

    @Override
    public void showInformation() {
        System.out.println("ФИНАНСОВАЯ НАКЛАДНАЯ: \nИтоговая сумма за месяц: " + finalSum +
                "\n" + "Дата документа: " + getDateOfDocument() +
                "\n" + "Номер документа: " + getNumberOfDocument() +
                "\n" + "Код департамента: " + codeOfDepartment +
                "\n" + "-------------------------");
    }
}
