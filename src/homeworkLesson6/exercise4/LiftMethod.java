package homeworkLesson6.exercise4;

public class LiftMethod {

    Lift lift = new Lift();

    private int numberOfMoves = 0;
    private int endFloor = lift.getStepDown()+1;



    public int getNumberOfMoves(){

        while (endFloor <= lift.getFloor()) {

            endFloor = endFloor - lift.getStepDown() + lift.getStepUp();

            numberOfMoves++;
        }

        return numberOfMoves;

    }





}
