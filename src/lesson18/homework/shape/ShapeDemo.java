package homework.shape;

public class ShapeDemo {
    public static void main(String[] args) {
        ShapeService shapeService = new ShapeService();
        shapeService.printEachShape(shapeService.getShapes());
        shapeService.printAllAreasPerimeters();

    }
}
