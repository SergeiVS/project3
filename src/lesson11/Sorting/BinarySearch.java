package Sorting;

public class BinarySearch {


    public int binarySearch(int[] workingArray,int min, int max, int numberForSearch){

        int middle= (max + min) / 2;

        while (min <= max) {
            if (numberForSearch > workingArray[middle]){
                min = middle+1;
            }
             if ( numberForSearch < workingArray[middle]) {
                 max = middle-1;
            }
             if (numberForSearch == workingArray[middle]){
                 return middle;
             }
            middle= (max + min) / 2;
        }


        return 0;
    }

}
