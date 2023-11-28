package lesson7.homework.Task4;

import java.util.Random;

public class LeapYearDemo {
    public static void main(String[] args) {

    LeapYear lp = new LeapYear();
    Random random = new Random();
    int year = random.nextInt(2023);

        System.out.println("Year " + year + " is a leap year: " +  lp.leapYear(year));
}
}
