package lessonCode;

abstract class MotorVehicle extends Vehicle implements ElgineOperation, GearBoxOperation{

    private Engine engine;
    private Transmission transmission;


    public MotorVehicle(String model, int speed, Engine engine, Transmission transmission) {
        super(model, speed);
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    void accelerate() {


    }

    @Override
    void brakeDown() {

    }

    @Override
    public void startEngine(Engine engine) {

    }

    @Override
    public void stopEngine(Engine engine) {

    }
}
