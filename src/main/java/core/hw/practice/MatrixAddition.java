package core.hw.practice;

public class MatrixAddition {
    public static int[][] addMatrix(int[][] first, int[][] second) {
        if (first.length == 0){
            return new int[0][0];
        }
        int[][] resultMatrix = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                resultMatrix[i][j] = first[i][j] + second[i][j];
            }
        }

        return resultMatrix;
    }
}
