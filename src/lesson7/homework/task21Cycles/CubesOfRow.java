package lesson7.homework.task21Cycles;

public class CubesOfRow {

    public int[] arrOfCubes( int n){
        int[] arrCubes = new int[n];
            for (int i = 0; i < n; i++) {
                int x = 1;
                for (int j = 0; j < 3; j++) {
                   x *= i+1;
                }
                arrCubes[i] = x;
            }
        return arrCubes;
    }
}
