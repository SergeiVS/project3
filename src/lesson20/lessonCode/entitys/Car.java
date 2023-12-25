package lessonCode.entitys;


import lessonCode.vehicleOperateInrefaces.ElgineOperation;
import lessonCode.vehicleOperateInrefaces.GearBoxOperation;

public class Car extends MotorVehicle20 implements GearBoxOperation, ElgineOperation {
    public Car(String model, Integer maxSpeed, Engine engine, Transmission transmission) {
        super(model, maxSpeed, engine, transmission);
    }

    @Override
    Integer speedUp(Integer currentSpeed) {
        if (getEngine().isStarted()) {
        } else {
            getEngine().setStarted(true);
        }
        if (currentSpeed <= getMaxSpeed()) {
            currentSpeed += 10;
            return currentSpeed;
        } else {
            return getMaxSpeed();
        }
    }

    @Override
    Integer speedDown(Integer currentSpeed) {
        System.out.println("Your current speed is: " + currentSpeed);
        return speedCheck(currentSpeed);
    }

    private static int speedCheck(Integer currentSpeed) {
        if (currentSpeed > 10) {
            currentSpeed -= 10;
            System.out.println("Your current speed is reduced till: " + currentSpeed);
            return currentSpeed;
        } else {
            currentSpeed = 0;
            System.out.println("car stopped");
            return currentSpeed;
        }
    }


    @Override
    public Integer stopVehicle(Integer currentSpeed) {
        return super.stopVehicle(currentSpeed);
    }

    @Override
    public Integer gearBoxOperate(Integer currentGear, Integer currentSpeed, Integer maxGear) {
        currentGear = getCurrentGear(currentGear, currentSpeed, maxGear);
        return currentGear;
    }

    private Integer getCurrentGear(Integer currentGear, Integer currentSpeed, Integer maxGear) {
        if (currentSpeed == 0){
            currentGear = 0;}
        if (stopEngine(getEngine(), getEngine().isStarted())){
            currentGear = 0;}
        if (startEngine(getEngine(), getEngine().isStarted())){
            currentGear = 0;}
        if (getCurrentSpeed() > 0 ) {getTransmission().setCurrentGear((getCurrentSpeed() / 30) + 1);}
        if (currentGear > maxGear) {getTransmission().setCurrentGear(maxGear);}
        return currentGear;
    }
}
