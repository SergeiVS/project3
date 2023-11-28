package lesson7.homework.task30;

import java.util.Scanner;

public class PrintOutDemo {
    public static void main(String[] args) {

    PintOut po = new PintOut();

    Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert your number: ");
    int n = scanner.nextInt();

    po.printOut(n);
}
}
