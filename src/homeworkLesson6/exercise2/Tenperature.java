package homeworkLesson6.exercise2;

import java.util.Scanner;

public class Tenperature {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("That is the temperature in reservoir 1?");

        double temperature1 = scanner.nextDouble();

        System.out.println("That is the temperature in reservoir 2?");

        double temperature2 = scanner.nextDouble();

        if (temperature1 > 100 && temperature2 < 100) {
            System.out.println("true");
        } else { System.out.println("false");}
    }
}
