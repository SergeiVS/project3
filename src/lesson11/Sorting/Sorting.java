package Sorting;

import java.util.Arrays;

public class Sorting {

    // Both methods working with approximately same speed;

    public int[] bubbelSort(int[] workingArray){

            int temp = 0;
            int length = workingArray.length;
            boolean notSorted = true;


            while (notSorted){
                notSorted = false;
                System.out.println();
                length--;
                for (int i = 0; i < length; i++) {
                   if (workingArray[i] > workingArray[i + 1]){
                       temp = workingArray[i];
                       workingArray[i] = workingArray[i+1];
                       workingArray[i + 1] = temp;
                       notSorted = true;
                       System.out.println(Arrays.toString(workingArray));
                   }
            }
        }
            return workingArray;
    }

    public int[] bubbleSort2 (int[] workingArray){
        int length = workingArray.length;
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                if ( workingArray[j-1] > workingArray[j]){
                    temp = workingArray[j-1];
                    workingArray[j-1] = workingArray[j];
                    workingArray[j] = temp;
                    System.out.println(Arrays.toString(workingArray));
                }
                System.out.println();

            }
        }
        return workingArray;
    }
}
