package task7;

import java.util.Random;

public class ArrayService {
    UserInput7 ui = new UserInput7();

    int arraySize = ui.uiInt("Please insert array´s size: ");

    private int[] fillArray(int arraySize){
        Random random = new Random();
        int [] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {

        array[i] = random.nextInt(0, 5);
        }
        return array;
    }
    int[] array1 = fillArray(arraySize);
    int[] array2 = fillArray(arraySize);


}
