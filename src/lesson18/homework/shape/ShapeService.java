package homework.shape;

import java.util.Arrays;
import java.util.Random;

public class ShapeService {
    Random random = new Random();

   private Shape[] shapes = fillShapesArray();

    public Shape[] getShapes() {
        return shapes;
    }

    private Shape[] createShapesArray(){
        shapes = new Shape[random.nextInt(10,20)];
        return shapes;
    }
    private Shape[] fillShapesArray(){

        shapes = createShapesArray();

        for (int i = 0; i < shapes.length; i++) {

            chooseShape(i);
        }
        return shapes;
    }

    private void chooseShape(int i) {
        int a;
        int b;
        int c;
        switch (random.nextInt(4)){

            case 0:
                shapes[i] = new Circle("Circle" + random.nextInt(10), random.nextInt(1,15));
                break;
            case 1:
                shapes[i] = new Rectangle("Rectangle" + random.nextInt(10), random.nextInt(1,15), random.nextInt(1,15));
                break;
            case 2:
                shapes[i] = new Square("Square" + random.nextInt(10), random.nextInt(1,15));
                break;
            case 3:
                IsTrianle isTriangle = getIsTrianle();

                shapes[i] = new Triangle("Triangle" + random.nextInt(10), isTriangle.a(), isTriangle.b(), isTriangle.c());

                break;
            default:
                System.out.println("something gone wrong!");
                break;
        }
    }

    private IsTrianle getIsTrianle() {
        int a;
        int b;
        int c;

        do {
            c = random.nextInt(1, 15);
            a = random.nextInt(1, 15);
            b = random.nextInt(1, 15);
        }
        while (!((a + b) > c && (a + c) > b && (b + c) > a));

        IsTrianle isTriangle = new IsTrianle(a, b, c);
        return isTriangle;
    }

    private record IsTrianle(int a, int b, int c) {
    }

    public void printEachShape(Shape[] shapes){

        System.out.println("shapes array contains " + shapes.length + " elements.");
        System.out.println();

        for (int i = 0; i < shapes.length; i++) {
            System.out.print(shapes[i].toString());
            System.out.print(" area: " + shapes[i].getArea() + ", ");
            System.out.println(" perimeter: " + shapes[i].getPerimeter());
            System.out.println();
        }
    }

    public void printAllAreasPerimeters(){
        double areas = 0;
        double perimeters = 0;
        for (int i = 0; i < shapes.length; i++) {
            areas += shapes[i].getArea();
            perimeters += shapes[i].getPerimeter();
        }
        System.out.println("sum of all areas of all shapes: " + areas);
        System.out.println();
        System.out.println("sum of all areas of all perimeters: " + perimeters);
    }

    @Override
    public String toString() {
        return "ShapeService{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }
}
