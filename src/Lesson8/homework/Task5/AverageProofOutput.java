package Lesson8.homework.Task5;

import java.util.Arrays;
import java.util.Scanner;

public class AverageProofOutput {
    public static void main(String[] args) {

        ArrayAverageProof au = new ArrayAverageProof();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your array length:");
        int arraySize = scanner.nextInt();

        int[] array = au.arrayFillRandom(arraySize);

        System.out.println(Arrays.toString(array));

        System.out.println("Array5´s average number is: " +au.arrayAverage(array));

        int[] array2 = new int[array.length];
        System.out.println(Arrays.toString(array2));
        System.out.println("Empty array average is: " + au.arrayAverage(array2));
    }
}


