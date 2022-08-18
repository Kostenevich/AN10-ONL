package lesson08.Figures;

public class Rectangle extends Figure implements Countable {
    private int sideX;
    private int sideY;

    public Rectangle(String name, int sideX, int sideY) {
        super(name);
        this.sideX = sideX;
        this.sideY = sideY;
    }

    @Override
    public double getArea() {
       return (sideX * sideY);
    }

    @Override
    public double getPerimeter() {
        return (2 * (sideX + sideY));
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
