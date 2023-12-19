package shape;

import java.util.Random;

public class Square extends Shape{

    private double sideA;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    double getArea() {return sideA * sideA;}

    @Override
    double getPerimeter() {return 4 * sideA;}

    @Override
    public String toString() {
        return " title=" + super.getTitle() +
                ", sideA=" + sideA + "; ";
    }
}
