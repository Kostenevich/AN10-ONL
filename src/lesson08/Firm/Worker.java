package lesson08.Firm;

public class Worker extends Employee {

    public Worker(String name) {
        super(name);
    }

    @Override
    public void printPosition() {
        System.out.println("Сотрудник " + getName() + " - рабочий");
    }
}
