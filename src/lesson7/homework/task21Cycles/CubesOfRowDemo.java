package lesson7.homework.task21Cycles;

import java.util.Scanner;

public class CubesOfRowDemo {
    public static void main(String[] args) {

        CubesOfRow cor = new CubesOfRow();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert length of the row: ");
        int n = scanner.nextInt();
        int[] arrOfCubes = cor.arrOfCubes(n);

        System.out.println("Cubes of numbers from 1 to " + n + " :");
        for (int i = 0; i < n; i++) {
            System.out.println("Cube from " + (i + 1)+ " is " + arrOfCubes[i]);
        }
    }
}
