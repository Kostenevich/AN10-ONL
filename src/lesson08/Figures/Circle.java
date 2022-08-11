package lesson08.Figures;

public class Circle extends Figure implements Countable {
    private static final double PI = 3.14;
    private int radius;


    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (PI * radius * radius);
    }

    @Override
    public double getPerimeter() {
        return (2 * PI * radius);
    }

    @Override
    public void countArea() {
        System.out.println("Площадь " + getName() + " = " + getArea());
    }

    @Override
    public void countPerimeter() {
        System.out.println("Периметер " + getName() + " = " + getPerimeter());
    }
}
