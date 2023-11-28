package lesson7.homework.Task4;

public class LeapYear {

    public boolean leapYear(int year) {

        if (year % 4 == 0) {}else {return false;}
        if (year % 100 == 0) {}else {return true;}
        if (year % 400 == 0){return true;}
        return false;
    }

    }
