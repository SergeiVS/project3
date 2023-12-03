package Lesson8.homework.task3;

import java.util.Arrays;
import java.util.Scanner;

public class ProofOutput {
    public static void main(String[] args) {

        ArrayRepeatedElementsProof au = new ArrayRepeatedElementsProof();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your array length:");
        int arraySize = scanner.nextInt();

        int[] array = au.arrayFillRandom(arraySize);


        System.out.println(Arrays.toString(array));

        System.out.println("Most repeated element of array is: " + au.mostRepeatedProof(array));



    }
}


