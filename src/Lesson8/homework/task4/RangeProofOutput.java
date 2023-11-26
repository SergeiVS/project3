package Lesson8.homework.task4;

import java.util.Arrays;
import java.util.Scanner;

public class RangeProofOutput {
    public static void main(String[] args) {

        ArrayRangeProof au = new ArrayRangeProof();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your array length:");
        int arraySize = scanner.nextInt();

        int[] array = au.arrayFillRandom(arraySize);


        System.out.println(Arrays.toString(array));
        System.out.println(au.arrayMax(array));
        System.out.println(au.arrayMin(array));


        System.out.println("Range between array´s biggest and smallest number is: " +(au.arrayMax(array) - au.arrayMin(array)));
    }
}


