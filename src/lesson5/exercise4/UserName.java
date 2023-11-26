package lesson5.exercise4;

import java.util.Scanner;

public class UserName {

    public static void main(String[] args) {

        System.out.println("Hi! That is your name?");

        Scanner input = new Scanner(System.in);

        String userName = input.nextLine();

        System.out.println("Hi! " + userName);

    }
}
