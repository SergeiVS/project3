package shape;

import java.util.Random;

public class Circle extends Shape{

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getArea() {return Math.PI * radius * radius;}

    @Override
    double getPerimeter() {return 2 * Math.PI * radius;}

    @Override
    public String toString() {
        return " title=" + super.getTitle() +
                ", radius=" + radius +
                "; ";
    }
}
