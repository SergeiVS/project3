package lessonCode;

import lessonCode.entitys.Car;
import lessonCode.entitys.Engine;
import lessonCode.entitys.Transmission;

public class VehicalApp {
    public static void main(String[] args) {

        Car car = new Car("Mercedes", 200, new Engine("V6", false), new Transmission(7, "Automatic", 0));
car.startEngine(car.getEngine(),car.getEngine().isStarted());
        car.stopEngine(car.getEngine(),car.getEngine().isStarted());
    }
}
