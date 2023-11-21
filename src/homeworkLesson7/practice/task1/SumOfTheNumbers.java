package homeworkLesson7.practice.task1;

import java.util.Scanner;

public class SumOfTheNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert your number =>");

        int n = scanner.nextInt();

        int sumOfTheNumbers = 0;

        for (int i = 0; i <= n; i = i+2) {

            sumOfTheNumbers = sumOfTheNumbers + i;

        }
        System.out.println("The sum of the even numbers between 0 and " + n + " is: " + sumOfTheNumbers);
    }
}
