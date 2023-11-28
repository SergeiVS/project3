package lesson7.homework.task2Programming;

public class Quoter {

    public String coordinateFieldQuoter(int x, int y) {

        if (x > 0 && y > 0) {
            return "Point x = " + x + ", y= " + y + " located in I quoter";
        }
        if (x > 0 && y < 0) {
            return "Point x = " + x + ", y= " + y + " located in II quoter";
        }
        if (x < 0 && y < 0) {
            return "Point x = " + x + ", y= " + y + " located in III quoter";
        }
        if (x < 0 && y > 0) {
            return "Point x = " + x + ", y= " + y + " located in IV quoter";
        }
        return "x = " + x +" y = " + y + " UPS";
    }
}