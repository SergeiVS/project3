package lessonCode.entitys;

import lessonCode.vehicleUtils.UserInput;

abstract class Vehicle20 {
    UserInput ui = new UserInput();
    private String model;
    private Integer maxSpeed;
    private Integer currentSpeed;

    public Vehicle20(String model, Integer maxSpeed, Integer currentSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
       this.currentSpeed = currentSpeed;
    }
    public Integer stopVehicle(Integer currentSpeed){
       if (currentSpeed > 0){
           while (currentSpeed > 0){
               speedDown(currentSpeed);
           }
       }
        System.out.println("your current speed is: " + currentSpeed);
       return currentSpeed;
    }
    abstract Integer speedUp(Integer currentSpeed);
    abstract Integer speedDown(Integer currentSpeed);


    public String getModel() {
        return model;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}




