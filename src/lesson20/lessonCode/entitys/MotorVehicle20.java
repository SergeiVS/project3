package lessonCode.entitys;

import lessonCode.vehicleOperateInrefaces.ElgineOperation;
import lessonCode.vehicleUtils.UserInput;

abstract class MotorVehicle20 extends Vehicle20 implements ElgineOperation {

    UserInput ui = new UserInput();
    private Engine engine;
    private Transmission transmission;


    public MotorVehicle20(String model, Integer maxSpeed, Engine engine, Transmission transmission) {

        super(model, maxSpeed);
        this.engine = engine;
        this.transmission = transmission;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    @Override
    Integer speedUp(Integer currentSpeed) {
        return 0;
    }

    @Override
    Integer speedDown(Integer currentSpeed) {
        return 0;
    }

    @Override
    public Integer stopVehicle(Integer currentSpeed) {
        return super.stopVehicle(currentSpeed);
    }

    @Override
    public boolean startEngine(Engine engine, boolean isStarted) {
        return ElgineOperation.super.startEngine(engine, isStarted);
    }

    @Override
    public boolean stopEngine(Engine engine, boolean isStarted) {
        return ElgineOperation.super.stopEngine(engine, isStarted);
    }
}
