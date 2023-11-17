package homeworkLesson4.car;

public class CarDemo {


    public static void main(String[] args) {

       // Creating of object 1

        Car car1 = new Car();

        // inserting of properties for object 1

        car1.model = "Mercedes";

        car1.engine = 2.3;

        car1.color = "red";

        car1.transmission = true;


        // Initiate of behaviour of object 1

       car1.beep();

       car1.drive();

        System.out.println(" ");


        // Creating of object 2

       Car car2 = new Car();

        // inserting of properties for object 2

        car2.model = "BMW";

         car2.engine = 2.5;

         car2.color = "Black";

         car2.transmission = false;

        // Initiate of behaviour of object 2

        car2.beep();

        car2.drive();


    }
}
