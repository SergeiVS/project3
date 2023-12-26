package lessonCode.entitys;


import lessonCode.vehicleOperateInrefaces.ElgineOperation;
import lessonCode.vehicleOperateInrefaces.GearBoxOperation;

public class MotorBike extends MotorVehicle20 implements ElgineOperation, GearBoxOperation {
    public MotorBike(String model, Integer maxSpeed, Engine engine, Transmission transmission) {
        super(model, maxSpeed, engine, transmission);
    }

    @Override
    Integer speedUp(Integer currentSpeed) {
        if(!getEngine().isStarted()){startEngine(getEngine(),getEngine().isStarted());}
        if (currentSpeed <= getMaxSpeed()) {
            currentSpeed += 20;
            return currentSpeed;
        } else {
            return getMaxSpeed();
        }
    }

    @Override
    Integer speedDown(Integer currentSpeed) {
        System.out.println("Your current speed is: " + currentSpeed);
        if (currentSpeed > 20) {
            currentSpeed -= 20;
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
    public Integer gearBoxOperate(Integer currentGear, Integer currentSpeed, Integer maxGear) {
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
