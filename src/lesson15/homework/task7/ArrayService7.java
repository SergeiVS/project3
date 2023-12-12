import java.util.Arrays;
import java.util.Random;

public class ArrayService7 {



    int[] array;

    public int[] fillArray(int arraySize){
        Random random = new Random();
        array = new int[arraySize];
            for (int i = 0; i < arraySize; i++){
                array[i] = random.nextInt(0, 5);
        }
            return array;
    }
    private int arrayAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }


    public void averageCompare(int[] array1, int[] array2){
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));
        int average1 = arrayAverage(array1);
        System.out.println("average1 " + average1);
        int average2 = arrayAverage(array2);
        System.out.println("average2 " + average2);
        if (average1 > average2) System.out.println("average of array1 is bigger as average of array2");
        if (average1 < average2) System.out.println("average of array2 is bigger as average of array1");
        if (average1 == average2) System.out.println("average of array1 equals average of array2");

    }


}
