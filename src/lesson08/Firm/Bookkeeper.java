package lesson08.Firm;

public class Bookkeeper extends Employee {

    public Bookkeeper(String name) {
        super(name);
    }

    @Override
    public void printPosition() {
        System.out.println("Сотрудник " + getName() + " - бухгалтер");
    }
}
