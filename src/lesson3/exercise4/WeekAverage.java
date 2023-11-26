package lesson3.exercise4;

public class WeekAverage {

    public static void main(String[] args) {

        //new object

    WeatherObservation ave = new WeatherObservation();

    // input of measures

    ave.tempSun = 8;

    ave.tempMon = 16;

    ave.tempThue = 12;

    ave.tempWed = 11;

    ave.tempThur = 11;

    ave.tempFrey = 9;

    ave.tempSat = 10;

    ave.weekNr = 45;

    // Object method


       ave.weekAverage();

    }
}
