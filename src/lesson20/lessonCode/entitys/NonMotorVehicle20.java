package lessonCode.entitys;


import lessonCode.entitys.Vehicle20;

abstract class NonMotorVehicle20 extends Vehicle20 {

    public NonMotorVehicle20(String model, Integer maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    Integer speedUp(Integer currentSpeed) {
        return false;
    }

    @Override
    Integer speedDown(Integer currentSpeed) {
        return -1;
    }
}
