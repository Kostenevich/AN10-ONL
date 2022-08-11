package lesson08.Firm;

public class Director extends Employee {

    public Director(String name) {
        super(name);
    }

    @Override
    public void printPosition() {
        System.out.println("Сотрудник " + getName() + " - Директор");
        ;
    }
}

