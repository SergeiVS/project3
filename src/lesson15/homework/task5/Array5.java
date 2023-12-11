package homework.task5;

import java.util.Arrays;
import java.util.Random;

public class Array5 {
    UserInput5 ui = new UserInput5();
    private int arrSize = ui.uiInt("Please insert array range: ");

    private int[] array;
    private int rangeMin = ui.uiInt("insert range min:");
    private int rangeMax = ui.uiInt("insert range max:");
    private int[] fillArray() {
        array = new int[arrSize];
        Random random = new Random();
        for (int i = 0; i < arrSize; i++) {
            array[i] = random.nextInt(rangeMin,rangeMax);
        }
        return array;
    }

    private int maxFinder() {
        int max = rangeMin;
        for (int i = 0; i < arrSize; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    private int lastMaxIndex() {

        for (int i = arrSize-1; i >= 0; i--) {
            if (array[i] == maxFinder()) {return i;}
        }
        return -1;
    }
    public void result(){
        System.out.println(Arrays.toString(fillArray()));
        System.out.println();
        System.out.println("The max number in array is: " + maxFinder());
        System.out.println();
        System.out.println("The last index of max number in array is " + lastMaxIndex());
    }
}
