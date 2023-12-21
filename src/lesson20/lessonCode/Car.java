package lessonCode;

public class Car extends MotorVehicle {
    @Override
    public void gearUp() {
        System.out.println("automatic up");

    }

    @Override
    public void gearDown() {
        System.out.println("automatic dawn");
    }

    @Override
    void startEngine() {
        System.out.println("Car starts it´s engine like a cat");

    }

    @Override
    void stopEngine() {
        System.out.println("Car stops engine by pushing the button");

    }

    @Override
    void accelerate() {
        System.out.println("Car starts hot");

    }

    @Override
    void brakeDown() {
        System.out.println("Car breaks shot");
    }
}
