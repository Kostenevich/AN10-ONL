package lesson08;

import lesson08.Figures.Circle;
import lesson08.Figures.Figure;
import lesson08.Figures.Rectangle;
import lesson08.Figures.Triangle;

/**
 * Заданеи №1
 * Написать иерархию классов «Фигуры».
 * Фигура -> Треугольник -> Прямоугольник -> Круг.
 * Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра.
 * Создать массив из 5 фигур.
 * Вывести на экран сумму периметра всех фигур в массиве.
 */

public class FigureApp {
    public static void main(String[] args) {
        Figure[] figures = {new Rectangle("Прямоугольник 1", 5, 6),
                new Triangle("Треугольник 1", 2, 5, 3, 3),
                new Circle("Круг 1", 5),
                new Circle("Круг 2", 1),
                new Triangle("Треугольник 2", 2, 5, 3, 3)};

        double sum = 0;
        for (Figure el : figures) {
            sum += el.getPerimeter();
        }
        System.out.println(sum);
    }
}
