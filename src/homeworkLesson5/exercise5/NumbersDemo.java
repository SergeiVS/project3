package homeworkLesson5.exercise5;

import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please insert number A:");

        double numberA = input.nextDouble();

        System.out.println("Please insert number B:");

        double numberB = input.nextDouble();

        Numbers numbers1 = new Numbers(numberA, numberB);

        numbers1.addition();

        System.out.println(" ");

        numbers1.substraction();

        System.out.println(" ");

        numbers1.multiplication();

        System.out.println(" ");

        numbers1.division();








    }
}
