package hw.oop;

public class MatrixDiagonal {
    /**
     * Реалізуй 2 методи для роботи з матрицями:
     * <p>
     * getDiagonal() повертає масив елементів від верхнього лівого кута до нижнього правого кута матриці;
     * getCounterDiagonal() повертає масив елементів від верхнього правого кута до нижнього лівого кута матриці.
     * Зверни увагу: int[][] matrix завжди є квадратною матрицею, тому її висота завжди дорівнює ширині.
     * <p>
     * Int[][] matrix = {{0, 1, 2},
     * {4, 5, 6},
     * {1, 1, 1}};
     * int[] diagonal = {0, 5, 1};
     * int[] counterDiagonal = {2, 5, 1};
     */

    public static int[] getDiagonal(int[][] matrix) {
        int[] res = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            res[i] = matrix[i][i];
        }

        return res;
    }

    public static int[] getCounterDiagonal(int[][] matrix) {
        int[] res = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            res[i] = matrix[i][matrix.length - 1 - i];
        }

        return res;
    }
}
