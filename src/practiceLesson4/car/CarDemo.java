package practiceLesson4.car;

public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.model = "Mercedes";

        car1.engine = 2.3;

        car1.color = "red";

        car1.transmission = true;



       car1.beep();

       car1.drive();

        System.out.println(" ");



       Car car2 = new Car();

        car2.model = "BMW";

         car2.engine = 2.5;

         car2.color = "Black";

         car2.transmission = false;

        car2.beep();

        car2.drive();


    }
}
