package Lesson8.homework.task2;

import java.util.Arrays;
import java.util.Scanner;

public class ProofOutput {
    public static void main(String[] args) {

        ArrayUniqueProof au = new ArrayUniqueProof();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your array length:");
        int arraySize = scanner.nextInt();

        int[] array = au.arrayFillRandom(arraySize);

        System.out.println(Arrays.toString(array));

        System.out.println("Are all of array elements uniq - " + au.uniqueProof(array));
    }
}


