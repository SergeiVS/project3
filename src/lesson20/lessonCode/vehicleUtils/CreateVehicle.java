package lessonCode.vehicleUtils;

import lessonCode.entitys.*;

public class CreateVehicle {
   UserInput ui = new UserInput();
    public Car createCar(){
        Car car = new Car(ui.uiText("insert model: "), ui.uiInt("insert max speed: "), new Engine(ui.uiText("insert engine parameters"), false), new Transmission(ui.uiInt("insert max gear: "), ui.uiText("insert transmission type: "), 0));
    return car;
    }
    public Truck creatTruck(){
        Truck tuck = new Truck(ui.uiText("insert model: "), ui.uiInt("insert max speed: "), new Engine(ui.uiText("insert engine parameters"), false), new Transmission(ui.uiInt("insert max gear: "), ui.uiText("insert transmission type: "), 0));
        return tuck;
    }
    public MotorBike creatMotorBike(){
        MotorBike motorBike = new MotorBike(ui.uiText("insert model: "), ui.uiInt("insert max speed: "), new Engine(ui.uiText("insert engine parameters"), false), new Transmission(ui.uiInt("insert max gear: "), ui.uiText("insert transmission type: "), 0));
        return motorBike;
    }
    public Bicycle creatBicycle(){
        Bicycle bicycle = new Bicycle(ui.uiText("insert model: "), ui.uiInt("insert max speed: "), new Transmission(ui.uiInt("insert max gear: "), ui.uiText("insert transmission type: "), 0));
        return bicycle;
    }
    public Scooter creatScooter(){
        Scooter scooter = new Scooter(ui.uiText("insert model: "), ui.uiInt("insert max speed: "));
        return scooter;
    }
}

