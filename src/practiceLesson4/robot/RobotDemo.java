package practiceLesson4.robot;

public class RobotDemo {

    public static void main(String[] args) {

        Robot robot1 = new Robot();

        robot1.setMark("Sony");

        robot1.setName("Yoko");


        Robot robot2 = new Robot();

        robot2.setMark("Huawei");

        robot2.setName("Xi");


        Robot robot3 = new Robot();

        robot3.setMark("LG");

        robot3.setName("Kim");

        System.out.println();

        System.out.println();

        double euroValue = robot1.currencyConvert(100, .97);

        System.out.println("For your 100 dollar you receive  " + euroValue + " euros");

    }
}
