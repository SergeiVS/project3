package lessonCode.entitys;


import lessonCode.entitys.Vehicle20;

abstract class NonMotorVehicle20 extends Vehicle20 {

    public NonMotorVehicle20(String model, Integer maxSpeed, Integer currentSpeed) {
        super(model, maxSpeed, 0);
    }

    @Override
    Integer speedUp(Integer currentSpeed) {
        return -1;
    }

    @Override
    Integer speedDown(Integer currentSpeed) {
        return -1;
    }

    @Override
    public Integer stopVehicle(Integer currentSpeed) {
        return super.stopVehicle(currentSpeed);
    }
}
