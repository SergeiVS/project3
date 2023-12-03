package Sorting;

import java.util.Arrays;
import java.util.Random;

public class Array {

    Random random = new Random();

    public int[] arrayFillRandom(int arrayLength){
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = random.nextInt(500);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public  int numberForSearch(int[] workingArray){
       int i = random.nextInt(workingArray.length);
        System.out.println(workingArray[i]);
       return workingArray[i];
    }
}
