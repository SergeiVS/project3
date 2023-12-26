package lessonCode;

import lessonCode.entitys.Car;
import lessonCode.entitys.Engine;
import lessonCode.entitys.Transmission;
import lessonCode.entitys.Truck;
import lessonCode.vehicleUtils.CreateVehicle;

public class VehicalApp {
    public static void main(String[] args) {
        CreateVehicle createVehicle = new CreateVehicle();
        //Truck truck = createVehicle.creatTruck();
        Car car = createVehicle.createCar();
        car.startEngine(car.getEngine(), car.getEngine().isStarted());
        System.out.println(car.getEngine().isStarted());





    }
}
