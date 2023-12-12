package task8;

import java.util.Arrays;
import java.util.Random;

public class ArrayService8 {
    task8.ArrayUtil8 au = new task8.ArrayUtil8();
    task8.Array8 array;
    private void setN(){
        array = new task8.Array8();
        int n = au.uiInt("please insert size of array: ");
        array.setN(n);
        while (4 > array.getN()) {
        array.setN (au.uiInt("wrong number, please insert new number: "));
        }
        System.out.println("array length: " + array.getN());
    }
    private void fillArray(){

        Random random = new Random();
        int[] arr = new int[array.getN()];

        for (int i = 0; i < array.getN(); i++){
           arr[i] = random.nextInt(array.getN());
        }
        array.setArray(arr);
        System.out.println((array.toString()));

    }

    public void arrayOfEvens() {

        setN();
        fillArray();
        int nEvens = 0;
        int counter = 0;

        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] % 2 == 0 && array.getArray()[i] > 0) {
                nEvens++;
            }
        }

            int[] arrayOfEvens = new int[nEvens];

            if (nEvens > 0) {

                for (int j = 0; j < array.getN(); j++) {
                    if (array.getArray()[j] % 2 == 0 && array.getArray()[j] > 0) {
                        arrayOfEvens[counter] = array.getArray()[j];
                        counter++;
                    }
                }
                System.out.println("array of evens from our array: " + Arrays.toString(arrayOfEvens));
            } else {System.out.println("array contains no evens");}

        }
    }

