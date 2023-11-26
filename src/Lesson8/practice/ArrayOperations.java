package Lesson8.practice;

import java.util.Random;

public class ArrayOperations {


    public int[] fillArrayRandom(int[] workingArray, int range){
        for (int i = 0; i < workingArray.length; i++) {

            Random random = new Random();
            workingArray[i] = random.nextInt(1000);
        }
        return workingArray;
    }

public int maxArrayElement(int[] workingArray) {
    int max = 0;
    for (int i = 0; i < workingArray.length; i++) {
        if (workingArray[i] > max) {
            max = workingArray[i];
        }
    }

    return max;
}

public int indexOfMaxElement(int[] workingArray) {

    int index = 0;
    int max = maxArrayElement(workingArray);

    for (int i = 0; i < workingArray.length; i++) {
        if (workingArray[i] == max) {
            index = i;
        }
    }
    return index;
}

    public int sumOfArrayElements(int[] workingArray){
        int sum = 0;
        for (int i = 0; i < workingArray.length; i++) {
            sum += workingArray[i];
        }

        return sum;
    }

}

