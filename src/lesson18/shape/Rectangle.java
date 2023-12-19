package shape;

import java.util.Random;

public class Rectangle extends Shape{

    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    double getArea() {return sideA * sideB;}

    @Override
    double getPerimeter() {return 2 * (sideA + sideB);}

    @Override
    public String toString() {
        return " title=" + super.getTitle() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                "; ";
    }
}
