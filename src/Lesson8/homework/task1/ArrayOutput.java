package Lesson8.homework.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayOutput {
    public static void main(String[] args) {

        ArrayOperations ao = new ArrayOperations();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your array length:");
        int arraySize = scanner.nextInt();

        int[] array = ao.arrayFillRandom(arraySize);

        System.out.println(Arrays.toString(array));

        int[] arrayReverce = ao.getArrayReverce(array);

        System.out.println(Arrays.toString(arrayReverce));
    }
}


