package lesson6.exercise4;

public class LiftMethod {

    Lift lift = new Lift();

    private int numberOfIterations = 0;
    private int currentFloor = 0;



    public int getNumberOfMoves() {

        while (currentFloor < lift.getFloor()) {

            currentFloor += lift.getStepUp(); // lift´s first move
            numberOfIterations++;             // iterations counter + 1
            System.out.println(currentFloor + " up");

            // floor check, if highest floor reached leave loop
            if (currentFloor >= lift.getFloor()) {
                return numberOfIterations;}

            // if highest floor not reached lift steps down
            currentFloor -= lift.getStepDown();
            System.out.println(currentFloor + " down");
        }
        return numberOfIterations;
    }
}
