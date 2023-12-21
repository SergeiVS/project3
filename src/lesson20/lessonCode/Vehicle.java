package lessonCode;

abstract class Vehicle {
    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    abstract void accelerate();
    abstract void brakeDown();

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }
}
