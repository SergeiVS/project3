package homeworkLesson6.practice.task1;

import java.util.Scanner;

public class NabouredNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert X=>");

        int x = scanner.nextInt();

        int difTo1000 = Math.abs(x - 1000);

        int difTo100 = Math.abs(x - 100);

        int difTo10 = Math.abs(x - 10);

        if (Math.min((Math.min(difTo10, difTo100)), difTo1000) == difTo1000) {

            System.out.println("Closest number to x is: 1000");

        } else if (Math.min((Math.min(difTo10, difTo100)), difTo1000) == difTo100) {

            System.out.println("Closest number to x is: 100");
        } else {
            System.out.println("Closest number to x is: 10");
        }
    }

}

