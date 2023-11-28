package lesson7.Practice.task3;

import java.util.Scanner;

public class sumofUserInputs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userInput = 0;

        int sumOfUserInputs = 0;

        while (userInput >= 0) {

            System.out.println("Please insert your number =>");

            userInput = scanner.nextInt();

            if (userInput >= 0) {

                sumOfUserInputs = sumOfUserInputs+userInput;
            }
        }

        System.out.println("The sum of user inputs is: " + sumOfUserInputs);

    }
}
