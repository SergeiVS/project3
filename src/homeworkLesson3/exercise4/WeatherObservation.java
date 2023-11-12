package homeworkLesson3.exercise4;

public class WeatherObservation {

    // Vaiables
    public double tempSun;

    public double tempMon;

    public double tempThue;

    public double tempWed;

    public double tempThur;

    public double tempFrey;

    public double tempSat;

    int weekNr;

    // Calculation method

    public void printAverage() {

      double  weekAverage = (tempSun + tempMon + tempThue + tempWed + tempThur + tempFrey + tempSat) / 7;



        System.out.println( "Average temperature in Baden-Baden at the week " + weekNr + " was " + weekAverage + " °C");

    }
}
