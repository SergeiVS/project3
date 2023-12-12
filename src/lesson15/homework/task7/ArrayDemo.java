import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayUtil7 au = new ArrayUtil7();
        ArrayService7 aS = new ArrayService7();
        int arraySize = au.uiInt("Please insert array´s size: ");

        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];

        array1 = aS.fillArray(arraySize);
        array2 = aS.fillArray(arraySize);

        aS.averageCompare(array1, array2);

    }
}
