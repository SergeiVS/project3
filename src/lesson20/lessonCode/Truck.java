package lessonCode;

public class Truck extends MotorVehicle{
    @Override
    public void gearUp() {
        System.out.println("heavy up");

    }

    @Override
    public void gearDown() {
        System.out.println("heavy dawn");
    }

    @Override
    void startEngine() {
        System.out.println("Truck starts it´s engine like a bear");

    }

    @Override
    void stopEngine() {
        System.out.println("Car stops engine by turning the key");

    }

    @Override
    void accelerate() {
        System.out.println("Truck starts slow");

    }

    @Override
    void brakeDown() {
        System.out.println("Truck breaks long");
    }
}
