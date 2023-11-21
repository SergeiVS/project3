package homeworkLesson6.exercise4;

import java.util.Scanner;

public class Lift {

    private int floor;

    private int stepUp;

    private int stepDown;

    Scanner scanner = new Scanner(System.in);

    public Lift(){

        System.out.print("Insert number of floors =>");

        floor = scanner.nextInt();

        System.out.println();

        System.out.print("Insert number of step up floors=>");

        stepUp = scanner.nextInt();

        System.out.println();

        System.out.print("Insert number of step down floors =>");

       stepDown = scanner.nextInt();
    }

    public int getFloor() {return floor;}

    public int getStepUp() {return stepUp;}

    public int getStepDown() {return stepDown;}
}
