package homework.task6;

import java.util.Arrays;
import java.util.Random;

public class Service {
    UserInput6 ui = new UserInput6();
    private int arrSize = ui.uiInt("Insert array range: ");
    private int minNumner = ui.uiInt("insert min number of array:");
    private int maxNumber = ui.uiInt("insert max number of:");
    private int[] array;

    private int[] fillArray() {
        array = new int[arrSize];
        Random random = new Random();
        for (int i = 0; i < arrSize; i++) {
          array[i] = random.nextInt(minNumner, maxNumber);
        }
        return array;
    }

    private int[] oddsChanger() {
        int[] changedArray = array;
        for (int i = 0; i < arrSize; i++) {
            if (changedArray[i] % 2 != 0) {
                changedArray[i] = 0;
            }
        }
        return changedArray;
    }


    public void result(){

        System.out.println("Outgoing array:");
        System.out.println(Arrays.toString(fillArray()));
        System.out.println();
        System.out.println("Changed array without odds: ");
        System.out.println(Arrays.toString(oddsChanger()));
    }
}


