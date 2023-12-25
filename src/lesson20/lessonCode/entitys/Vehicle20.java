package lessonCode.entitys;

abstract class Vehicle20 {
    private String model;
    private Integer maxSpeed;
    private Integer currentSpeed;

    public Vehicle20(String model, Integer maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    public Integer stopVehicle(Integer currentSpeed){
       if (currentSpeed > 0){
           while (currentSpeed > 0){
               speedDown(currentSpeed);
           }
       }
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
}




