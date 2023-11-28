package Lesson8.homework.Task5;

import java.util.Random;

public class ArrayAverageProof {

    public int[] arrayFillRandom(int size){
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public int arrayAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }


}
