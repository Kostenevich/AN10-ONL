package lesson08.Registration.Document;

import lesson08.Registration.Register;
import lesson08.Registration.Show;

import java.util.Date;

abstract public class Documents extends Register implements Show {
    private Date dateOfDocument = new Date();

    private int numberOfDocument;

    public Documents(Date dateOfDocument, int numberOfDocument) {
        this.dateOfDocument = dateOfDocument;
        this.numberOfDocument = numberOfDocument;
    }

    public Documents() {

    }

    public Date getDateOfDocument() {
        return dateOfDocument;
    }

    public void setDateOfDocument(Date dateOfDocument) {
        this.dateOfDocument = dateOfDocument;
    }

    public int getNumberOfDocument() {
        return numberOfDocument;
    }

    public void setNumberOfDocument(int numberOfDocument) {
        this.numberOfDocument = numberOfDocument;
    }
}
