package Lesson8.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your array range:");
        int arraySize = scanner.nextInt();

        ArrayOperations aO = new ArrayOperations();


        int[] intArray = new int[arraySize];

        aO.fillArrayRandom(intArray, arraySize);

        System.out.println(Arrays.toString(intArray));
        System.out.println("Max element of array is: " + aO.maxArrayElement(intArray) + " it´s index is: " + aO.indexOfMaxElement(intArray));
        System.out.println("Sum of array elements is: " + aO.sumOfArrayElements(intArray));


    }
}
