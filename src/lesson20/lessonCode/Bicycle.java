package lessonCode;

public class Bicycle extends NonMotorVehicle implements GearBoxOperation {
    @Override
    public void gearUp() {
        System.out.println("Gear up by hand");
    }

    @Override
    public void gearDown() {
        System.out.println("gear down by hand" );

    }

    @Override
    void accelerate() {
        System.out.println("Bicycle starts by pushing pedals");

    }

    @Override
    void brakeDown() {
        System.out.println("Bicycle stops with hand break");

    }
}
