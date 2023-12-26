package lessonCode.entitys;


import lessonCode.vehicleOperateInrefaces.ElgineOperation;
import lessonCode.vehicleOperateInrefaces.GearBoxOperation;

public class Car extends MotorVehicle20 implements GearBoxOperation, ElgineOperation {
    public Car(String model, Integer maxSpeed, Engine engine, Transmission transmission) {
        super(model, maxSpeed, engine, transmission);
    }

    @Override
    public void setEngine(Engine engine) {
        super.setEngine(engine);
    }

    @Override
    public void setTransmission(Transmission transmission) {
        super.setTransmission(transmission);
    }

    @Override
    public Engine getEngine() {
        return super.getEngine();
    }

    @Override
    public Transmission getTransmission() {
        return super.getTransmission();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public Integer getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public Integer getCurrentSpeed() {
        return super.getCurrentSpeed();
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
    Integer speedUp(Integer currentSpeed) {
        if(!getEngine().isStarted()){startEngine(getEngine(),getEngine().isStarted());}
        if (currentSpeed <= getMaxSpeed()) {
            currentSpeed += 15;
            return currentSpeed;
        } else {
            return getMaxSpeed();
        }
    }



    @Override
    public Integer speedDown(Integer currentSpeed) {
        System.out.println("Your current speed is: " + currentSpeed);
        if (currentSpeed > 15) {
            currentSpeed -= 15;
            System.out.println("Your current speed is reduced till: " + currentSpeed);
            return currentSpeed;
        } else {return super.stopVehicle(currentSpeed);}
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
        if (getCurrentSpeed() > 0 ) {getTransmission().setCurrentGear((getCurrentSpeed() / 40) + 1);}
        if (currentGear > maxGear) {getTransmission().setCurrentGear(maxGear);}
        return currentGear;
    }
}
