package lessonCode.entitys;

import lessonCode.NonMotorVehicle;
import lessonCode.entitys.abstractEntitys.NonMotorVehicle20;

public class Scooter extends NonMotorVehicle20 {
    @Override
    void accelerate() {
        System.out.println("scooter starts by pushing the ground");
    }

    @Override
    void brakeDown() {
        System.out.println("scooter stopts by pushing the pedal");

    }
}
