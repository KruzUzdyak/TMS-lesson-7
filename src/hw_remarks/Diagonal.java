package hw_remarks;

import java.util.Arrays;

public class Diagonal {

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        }

        for (int[] vector : matrix) {
            System.out.println(Arrays.toString(vector));
        }

        String diagonal1 = "";
        String diagonal2 = "";
        for (int i = 0; i < matrix.length; i++) {
            diagonal1 += matrix[i][i] + " ";
            diagonal2 += matrix[i][matrix.length - 1 - i] + " ";
        }

        System.out.println(diagonal1);
        System.out.println(diagonal2);
    }
}
