package homeworkLesson6.exercise1;

import java.util.Scanner;

public class Shoping {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Is Edeka open?");

        boolean isEdekaOpen = scanner.nextBoolean();

        System.out.println("Is Rewe open?");

        boolean isReweOpen = scanner.nextBoolean();

        System.out.println("Can I go to shop?");

        if (isEdekaOpen || isReweOpen) {

            System.out.println("Yes I can");

        } else {

            System.out.println("I can`t");

        }
    }

}
