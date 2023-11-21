package homeworkLesson7.practice.task5;

import java.util.Scanner;

public class sumOfEvensAndOdds {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert you positive number =>");

        int n = scanner.nextInt();

        int sumOfEvens = 0;

        int sumOfOdds = 0;


        if (n > 0) {
            for (int i = n; i > 0; i--) {


                if (i % 2 == 0) {
                    sumOfEvens = sumOfEvens + i;
                } else {
                    sumOfOdds = sumOfOdds + i;
                }


            }
            System.out.println("Sum of evens is: " + sumOfEvens);

            System.out.println("Sum of Odds is: " + sumOfOdds);
        }
    }
}
