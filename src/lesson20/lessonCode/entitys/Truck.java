package lessonCode.entitys;


import lessonCode.vehicleOperateInrefaces.ElgineOperation;
import lessonCode.vehicleOperateInrefaces.GearBoxOperation;

public class Truck extends MotorVehicle20 implements ElgineOperation, GearBoxOperation {
    public Truck(String model, Integer maxSpeed, Engine engine, Transmission transmission) {
        super(model, maxSpeed, 0, engine, transmission);
    }

    @Override
    public Integer speedUp(Integer currentSpeed) {
        if(!getEngine().isStarted()){getEngine().setStarted(true);}
        if (currentSpeed <= getMaxSpeed()) {
            currentSpeed += 5;
            return currentSpeed;
        } else {
            return getMaxSpeed();
        }
    }

    @Override
    public Integer speedDown(Integer currentSpeed) {
        System.out.println("Your current speed is: " + currentSpeed);
        if (currentSpeed > 5) {
            currentSpeed -= 5;
            System.out.println("Your current speed is reduced till: " + currentSpeed);
            return currentSpeed;
        } else {return super.stopVehicle(currentSpeed);}
    }

    @Override
    public Integer stopVehicle(Integer currentSpeed) {
        return super.stopVehicle(currentSpeed);
    }

    @Override
    public boolean startEngine(Engine engine, boolean isStarted) {
        return super.startEngine(engine, isStarted);
    }

    @Override
    public boolean stopEngine(Engine engine, boolean isStarted) {
        return super.stopEngine(engine, isStarted);
    }

    @Override
    public Integer shiftGear(Integer currentGear, Integer currentSpeed, Integer maxGear) {

        if (currentSpeed == 0){
            currentGear = 0;}
        if (stopEngine(getEngine(), getEngine().isStarted())){
            currentGear = 0;}
        if (startEngine(getEngine(), getEngine().isStarted())){
            currentGear = 0;
        return currentGear;
        }
        if (getCurrentSpeed() > 0 ) {getTransmission().setCurrentGear((getCurrentSpeed() / 7) + 1);}
        if (currentGear > maxGear) {getTransmission().setCurrentGear(maxGear);}
        System.out.println();
        return currentGear;
    }
}
