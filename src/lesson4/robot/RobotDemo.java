package lesson4.robot;

public class RobotDemo {

    public static void main(String[] args) {

        //Creating and activating of object 1

        Robot robot1 = new Robot();

        robot1.mark = "Sony";

        robot1.name = "Yoko";

        robot1.setMark();

        robot1.setName();

        //Creating and activating of object 2

        Robot robot2 = new Robot();

        robot2.mark = "Huawei";

        robot2.name = "Xi";

        robot2.setMark();

        robot2.setName();

        //Creating and activating of object 3


        Robot robot3 = new Robot();

        robot3.mark = "LG";

        robot3.name = "Kim";

        robot3.setMark();

        robot3.setName();

        System.out.println();

        System.out.println();

        System.out.println(" ");



       robot1.currencyConvert(100, .97);



        System.out.println(" ");

        // Print out the robot´s data

        robot3.robotPrintOut();

    }
}
