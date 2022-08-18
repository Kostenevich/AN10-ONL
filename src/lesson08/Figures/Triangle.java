package lesson08.Figures;

public class Triangle extends Figure implements Countable{
    private int height;
    private int base;
    private int sideX;
    private int sideY;

    public Triangle(String name, int height, int base, int sideX, int sideY) {
        super(name);
        this.height = height;
        this.base = base;
        this.sideX = sideX;
        this.sideY = sideY;
    }

    @Override
    public double getArea() {
        return (0.5 * base * height);
    }

    @Override
    public double getPerimeter() {
        return (sideX + sideY + base);
    }

    @Override
    public void countArea () {
        System.out.println("Площадь " + getName() + " = " + getArea());
    }

    @Override
    public void countPerimeter () {
        System.out.println("Периметер " + getName() + " = " + getPerimeter()) ;
    }
}
