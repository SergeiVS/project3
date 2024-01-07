package lessonCode;

import lessonCode.entitys.*;
import lessonCode.vehicleUtils.CreateVehicle;

public class VehicalApp {
    public static void main(String[] args) {

        Transmission carTransmission = new Transmission(8,"aut", 0);
        Transmission truckTransmission = new Transmission(12, "man", 0);
        Transmission motorbikeTransmission = new Transmission(6, "man", 0);
        Transmission bikeTransmission = new Transmission(21, "man", 1);

        Engine carEngine = new Engine("v6", false);
        Engine truckEngine = new Engine("V12", false);
        Engine motorbikeEngine = new Engine("v2", false);


        Car car = new Car("Mers", 250,  carEngine, carTransmission);
        Truck truck = new Truck("Man", 85,truckEngine,truckTransmission);
        MotorBike motorBike = new MotorBike("Honda", 250, motorbikeEngine, motorbikeTransmission);
        Bicycle bicycle = new Bicycle("Bianci", 50, bikeTransmission);

        car.startEngine(carEngine, car.getEngine().isStarted());
        car.speedUp(car.getCurrentSpeed());
        car.speedUp(car.getCurrentSpeed());
        car.speedUp(car.getCurrentSpeed());
        System.out.println(car.getTransmission().getCurrentGear());
    }
}
