package Lesson8.homework.task1;

import java.util.Random;

public class ArrayOperations {

    public int[] arrayFillRandom(int size){
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public int[] getArrayReverce(int[] array) {
        int arraySize = array.length;
        int[] arrayTurnOut = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            arrayTurnOut[arraySize - 1] = array[i];
            arraySize--;
        }
        return arrayTurnOut;
    }

}
