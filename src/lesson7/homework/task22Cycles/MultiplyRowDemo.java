package lesson7.homework.task22Cycles;

import java.util.Scanner;

public class MultiplyRowDemo {
    public static void main(String[] args) {

        MultiplyRow mr = new MultiplyRow();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert your number: ");
        int n = scanner.nextInt();

        mr.rowMultiply(n);


    }
}
