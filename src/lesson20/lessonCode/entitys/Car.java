package lessonCode.entitys;


import lessonCode.vehicleOperateInrefaces.ElgineOperation;
import lessonCode.vehicleOperateInrefaces.GearBoxOperation;

public class Car extends MotorVehicle20 implements GearBoxOperation, ElgineOperation {

    public Car(String model, Integer maxSpeed, Engine engine, Transmission transmission) {
        super(model, maxSpeed, 0, engine, transmission);
    }

    @Override
    public Integer getCurrentSpeed() {
        return super.getCurrentSpeed();
    }

    @Override
    public void setCurrentSpeed(Integer currentSpeed) {
        super.setCurrentSpeed(currentSpeed);
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
    public boolean startEngine(Engine engine, boolean isStarted) {
        return super.startEngine(engine, isStarted);
    }

    @Override
    public boolean stopEngine(Engine engine, boolean isStarted) {
        return super.stopEngine(engine, isStarted);
    }

    @Override
    public Integer speedUp(Integer currentSpeed) {

        if(!getEngine().isStarted()){startEngine(getEngine(),getEngine().isStarted());}

        System.out.println("Your current speed is: " + currentSpeed);

        if (currentSpeed < getMaxSpeed()) {
            setCurrentSpeed(currentSpeed += 15);

            getTransmission().setCurrentGear(shiftGear(getTransmission().getCurrentGear(),currentSpeed,getTransmission().getMaxGear()));

        }
        if (currentSpeed >= getMaxSpeed()) {
            currentSpeed = getMaxSpeed();
            getTransmission().setCurrentGear(shiftGear(getTransmission().getCurrentGear(),currentSpeed,getTransmission().getMaxGear()));
             }
        System.out.println("Your current speed is risen up to: " + currentSpeed);

        return currentSpeed;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Integer speedDown(Integer currentSpeed) {
        System.out.println("Your current speed is: " + currentSpeed);

        if (currentSpeed > 15) {
            setCurrentSpeed(currentSpeed -= 15);

            getTransmission().setCurrentGear(shiftGear(getTransmission().getCurrentGear(),currentSpeed,getTransmission().getMaxGear()));
            System.out.println("Your current speed is reduced till: " + currentSpeed);
            return currentSpeed;
        }
        getTransmission().setCurrentGear(shiftGear(getTransmission().getCurrentGear(), currentSpeed, getTransmission().getMaxGear()));
        return super.stopVehicle(currentSpeed);
    }

    @Override
    public Integer stopVehicle(Integer currentSpeed) {
        return super.stopVehicle(currentSpeed);

    }

    @Override
    public Integer shiftGear(Integer currentGear, Integer currentSpeed, Integer maxGear) {
        getTransmission().setCurrentGear(findCurrentGear(currentGear, currentSpeed, maxGear));
        return currentGear;
    }

    private Integer findCurrentGear(Integer currentGear, Integer currentSpeed, Integer maxGear) {
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
