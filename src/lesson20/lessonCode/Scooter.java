package lessonCode;

public class Scooter extends NonMotorVehicle {
    @Override
    void accelerate() {
        System.out.println("scooter starts by pushing the ground");
    }

    @Override
    void brakeDown() {
        System.out.println("scooter stopts by pushing the pedal");

    }
}
