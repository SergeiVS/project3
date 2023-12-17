package lesson15.homework.task4;

import task4.Matrix;

import java.util.Arrays;
import java.util.Random;

public class MatrixService {
    lesson15.homework.task4.UserInput4 ui = new lesson15.homework.task4.UserInput4();
    lesson15.homework.task4.UserOutput uo = new lesson15.homework.task4.UserOutput();
    private Matrix matrix;
    private int n;

    private int[][] fillMatrix(){
        Random random = new Random();
        n = ui.uiInt("insert matrix size: ");
       int[][] workingMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                workingMatrix[i][j] = random.nextInt(15);
            }
        }
        return workingMatrix;
    }
    public void matrixTranspose(){

        matrix = new Matrix(fillMatrix());
        uo.printOut(matrix);

        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = i+1; j < matrix.getMatrix().length; j++) {
                int temp;
                temp = matrix.getMatrix()[i][j];
                matrix.getMatrix()[i][j] = matrix.getMatrix()[j][i];
                matrix.getMatrix()[j][i] = temp;
            }
        }
        uo.printOut(matrix);
    }
}
