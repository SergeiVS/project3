package lessonCode.entitys;



import lessonCode.vehicleOperateInrefaces.GearBoxOperation;
import lessonCode.vehicleUtils.UserInput;


public class Bicycle extends NonMotorVehicle20 implements GearBoxOperation {
UserInput ui = new UserInput();
Transmission transmission;

    public Bicycle(String model, Integer maxSpeed, Transmission transmission) {
        super(model, maxSpeed);
        this.transmission = new Transmission(ui.uiInt("insert max gear"), "manual", 1);
    }

    @Override
    public Integer gearBoxOperate(Integer currentGear, Integer currentSpeed, Integer maxGear) {
        return transmission.setCurrentGear(ui.uiInt("set needed gear"));
    }

    @Override
    Integer speedUp(Integer currentSpeed) {
        System.out.println("Your current speed is: " + currentSpeed);
        if (currentSpeed <= getMaxSpeed()) {
            currentSpeed += 6;
            System.out.println("Your current speed is risen up to: " + currentSpeed);
            return currentSpeed;
        } else {
            System.out.println("Your current speed is risen up to: " + getMaxSpeed());
            return getMaxSpeed();
        }
    }

    @Override
    Integer speedDown(Integer currentSpeed) {
        System.out.println("Your current speed is: " + currentSpeed);
        if (currentSpeed > 6) {
            currentSpeed -= 6;
            System.out.println("Your current speed is reduced till: " + currentSpeed);
            return currentSpeed;
        } else {return super.stopVehicle(currentSpeed);}
    }

    @Override
    public Integer stopVehicle(Integer currentSpeed) {
        return super.stopVehicle(currentSpeed);
    }
}
