package lesson08.Figures;

/**
 Абстарктный класс Фигура с параметрами:
 - имя;
 - переменная х;
 - переменная y.
 */

abstract public class Figure {
    private String name;
    private double area;
    private double perimeter;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
