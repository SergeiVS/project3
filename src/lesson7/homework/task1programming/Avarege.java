package lesson7.homework.task1programming;

import java.util.Arrays;
import java.util.Random;

public class Avarege {
    public static void main(String[] args) {

        Random random = new Random();
        int arrLength = random.nextInt(2,20);
        int[] arr = new int[arrLength];
        double average = 0;

        for (int i = 0; i < arrLength; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int i = 0; i < arrLength; i++) {
            average += arr[i];
        }
        System.out.println("Average of numbers row:");
        System.out.println(Arrays.toString(arr));
        System.out.println("is: " + average/arrLength);
    }
}
