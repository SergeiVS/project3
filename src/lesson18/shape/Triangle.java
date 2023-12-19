package shape;

import java.util.Random;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    double getArea() {

        double s=(((sideA+sideB+sideC)/2)*(((sideA+sideB+sideC)/2)-sideA)*(((sideA+sideB+sideC)/2)-sideB)*(((sideA+sideB+sideC)/2)-sideC));

         return Math.sqrt(Math.abs(s));
    }

    @Override
    double getPerimeter() {return sideA + sideB + sideC;}

    @Override
    public String toString() {
        return "title=" + super.getTitle() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +"; ";
    }
}
