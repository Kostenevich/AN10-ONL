package lesson08.Registration.Document;

import java.util.Date;

public class Supply extends Documents {
    private int countOfGoods;
    String typeOfGoods;

    public Supply(Date dateOfDocument, int numberOfDocument, int countOfGoods, String typeOfGoods) {
        super(dateOfDocument, numberOfDocument);
        this.countOfGoods = countOfGoods;
        this.typeOfGoods = typeOfGoods;
    }

    public Supply() {

    }

    public int getCountOfGoods() {
        return countOfGoods;
    }

    public void setCountOfGoods(int countOfGoods) {
        this.countOfGoods = countOfGoods;
    }

    public String getTypeOfGoods() {
        return typeOfGoods;
    }

    public void setTypeOfGoods(String typeOfGoods) {
        this.typeOfGoods = typeOfGoods;
    }

    @Override
    public void showInformation() {
        System.out.println("КОНТРАКТ НА ПОСТАВКУ ТОВАРОВ: \nНомер документа: " + getNumberOfDocument() +
                "\n" + "Тип товара: " + typeOfGoods +
                "\n" + "Количество товаров: " + countOfGoods +
                "\n" + "Дата документа: " + getDateOfDocument() +
                "\n" + "-------------------------");


    }
}
