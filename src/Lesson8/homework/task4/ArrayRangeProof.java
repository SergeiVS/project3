package Lesson8.homework.task4;

import java.util.Random;

public class ArrayRangeProof {

    public int[] arrayFillRandom(int size){
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public int arrayMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public int arrayMin(int[] arr) {
        int min = arrayMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


}
