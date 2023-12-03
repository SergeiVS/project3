package Sorting;

import Sorting.Array;
import Sorting.BinarySearch;
import Sorting.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {

        Sorting sort = new Sorting();
        Array array = new Array();
        BinarySearch bs = new BinarySearch();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert our array length: ");
        int arraySize = scanner.nextInt();

        int[] arrayForSearch = array.arrayFillRandom(arraySize);

        System.out.println(Arrays.toString(arrayForSearch));

        int numberForSearch = array.numberForSearch(arrayForSearch);

        System.out.println("Our outgoing array:");
        System.out.println(Arrays.toString(arrayForSearch));

        System.out.print("Number to search from current array: ");
        System.out.println(numberForSearch);

      int[] arrayForSearchBubble1 = sort.bubbelSort(arrayForSearch);

        System.out.println();

      // int[] arrayForSearchBubble2 = sort.bubbleSort2(arrayForSearch);

     int position = bs.binarySearch(arrayForSearchBubble1,0, arraySize-1, numberForSearch);

       System.out.println("Searched number: " + numberForSearch + " is located in array on position " + position);
}
 }