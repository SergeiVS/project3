package lessonCode.entitys;

import lessonCode.entitys.NonMotorVehicle20;


public class Scooter extends NonMotorVehicle20 {
    public Scooter(String model, Integer maxSpeed) {
        super(model, maxSpeed, 0);
    }

    @Override
    public Integer speedUp(Integer currentSpeed) {
        System.out.println("Your current speed is: " + currentSpeed);
        if (currentSpeed <= getMaxSpeed()) {
            currentSpeed += 2;
            System.out.println("Your current speed is risen up to: " + currentSpeed);
            return currentSpeed;
        } else {
            System.out.println("Your current speed is risen up to: " + getMaxSpeed());
            return getMaxSpeed();
        }

    }

    @Override
    public Integer speedDown(Integer currentSpeed) {
        System.out.println("Your current speed is: " + currentSpeed);
        if (currentSpeed > 2) {
            currentSpeed -= 2;
            System.out.println("Your current speed is reduced till: " + currentSpeed);
            return currentSpeed;
        } else {return super.stopVehicle(currentSpeed);}
    }

    @Override
    public Integer stopVehicle(Integer currentSpeed) {
        return super.stopVehicle(currentSpeed);
    }
}
