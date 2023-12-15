package task4;

import java.util.Arrays;

public class Matrix {

    private int n;
    private int[][] matrix = new int[n][n];

    public Matrix(int n) {
        this.n = n;
    }

    public Matrix(int n, int[][] matrix) {
        this.n = n;
        this.matrix = matrix;
    }

    public int getN() {
        return n;
    }

    public int[][] getMatrix() {
        return matrix;
    }


    @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + Arrays.toString(matrix) +
                '}';
    }
}
