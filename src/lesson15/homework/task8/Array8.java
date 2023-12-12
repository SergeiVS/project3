package task8;

import java.util.Arrays;

public class Array8 {
    private int[] array;
    private int n;

    @Override
    public String toString() {
        return "Array8{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
