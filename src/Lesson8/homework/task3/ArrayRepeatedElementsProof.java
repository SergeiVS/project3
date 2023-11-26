package Lesson8.homework.task3;

import java.util.Random;

public class ArrayRepeatedElementsProof {

    public int[] arrayFillRandom(int size){
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public int mostRepeatedProof(int[] arr) {
        int k;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {

            int max = 0;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {

                    counter++;
                }
                if (counter > max) {
                    max = counter;
                    k = arr[i];
                    return k;
                }
            }

        }
        return 0;
    }
}
