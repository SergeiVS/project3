package lesson15.homework.task4;

import task4.Matrix;

public class UserOutput {
    public  void printOut(Matrix matrix){
        System.out.println();
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix().length; j++) {
                System.out.print(matrix.getMatrix()[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println();
    }
}
