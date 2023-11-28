package lesson7.homework.task34;

import java.util.Scanner;

public class SumOfNumberPositionsDemo {
    public static void main(String[] args) {

        SumOfNumberPositions sn = new SumOfNumberPositions();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your number: ");
       int number = scanner.nextInt();

        System.out.println("Sum of all positions of your number is: " + sn.sumOfNumbersPositions(number));
    }
}
