package lesson7.homework.task1programming;

import java.util.Scanner;

public class PowN {

    public static void main(String[] args) {

        // needed to receive n degree of integer x
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert number x n > 0 => ");
        int x = scanner.nextInt();
        System.out.print("Please insert degree n n >= 0 => ");
        int n = scanner.nextInt();
        int powX = 1;

        for (int i = 0; i < n; i++) {
            powX *= x;

        }

        System.out.println("Number " + x + " in degree " + n + " is: " + powX);


    }
}
