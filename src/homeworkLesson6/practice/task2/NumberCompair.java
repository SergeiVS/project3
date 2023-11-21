package homeworkLesson6.practice.task2;

import java.util.Scanner;

public class NumberCompair {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas insert number x ->");

        int x = scanner.nextInt();

        System.out.println("Pleas insert number y ->");

        int y = scanner.nextInt();

        System.out.println("Pleas insert number z ->");

        int z = scanner.nextInt();

        int minNumber = Math.min(Math.min(x, y), z);

        int maxNumber = Math.max(Math.max(x, y), z);

        int middle = x + y+ z - maxNumber - minNumber;

        System.out.println("The numbers in ascending order: " + minNumber + " , " + middle + " , " + maxNumber);

        System.out.println("The numbers in descending order: " + maxNumber + " , " + middle + " , " + minNumber);







    }
}
