package Lesson8.homework.task2;

import java.util.Random;

public class ArrayUniqueProof {

    public int[] arrayFillRandom(int size){
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public boolean uniqueProof(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

}
