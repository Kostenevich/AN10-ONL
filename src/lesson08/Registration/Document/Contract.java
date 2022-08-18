package lesson08.Registration.Document;

import java.util.Date;

public class Contract extends Documents {
    private Date dateOfContract;
    private Date dateOfEnding;
    private String nameOfEmployee;

    public Contract(Date dateOfDocument, int numberOfDocument, Date dateOfContract, Date dateOfEnding, String nameOfEmployee) {
        super(dateOfDocument, numberOfDocument);
        this.dateOfContract = dateOfContract;
        this.dateOfEnding = dateOfEnding;
        this.nameOfEmployee = nameOfEmployee;
    }

    public Contract() {

    }

    public Date getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(Date dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public Date getDateOfEnding() {
        return dateOfEnding;
    }

    public void setDateOfEnding(Date dateOfEnding) {
        this.dateOfEnding = dateOfEnding;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    @Override
    public void showInformation() {
        System.out.println("КОНТРАКТ С СОТРУДНИКОМ: \nНомер документа: " + getNumberOfDocument() +
                "\n" + "Дата документа: " + getDateOfDocument() +
                "\n" + "Дата документа: " + dateOfContract +
                "\n" + "Дата окончания контакта: " + dateOfEnding +
                "\n" + "Имя сотрудника: " + nameOfEmployee +
                "\n" + "-------------------------");

    }
}
