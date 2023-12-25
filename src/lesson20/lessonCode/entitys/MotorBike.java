package lessonCode.entitys;

import lessonCode.MotorVehicle;
import lessonCode.entitys.abstractEntitys.MotorVehicle20;

public class MotorBike extends MotorVehicle20 {
    @Override
    public void gearUp() {
        System.out.println("easy up");

    }

    @Override
    public void gearDown() {
        System.out.println("easy dawn");
    }

    @Override
    void startEngine() {
        System.out.println("Bike starts it´s engine like zoom - zoom");

    }

    @Override
    void stopEngine() {
        System.out.println("Bike stops engine by fulling handle");

    }

    @Override
    void accelerate() {
        System.out.println("Bike starts which smoke under it´s wheel");

    }

    @Override
    void brakeDown() {
        System.out.println("Bike breaks quick");
    }
}
