package _2DArrays;

import java.util.Scanner;

public class RowWithMaximumSum {
    static void main() {
        int[][] arr = {{2,9,5},{8,1,6},{13,7,4}};
        int row = arr.length;
        int col = arr[0].length;

        int maxSum = Integer.MIN_VALUE;
        int resultRow = -1;

        for (int i = 0; i < row; i++) {
            int sumOfRow = 0;
            for (int j = 0; j < col; j++) {
                sumOfRow += arr[i][j];
            }

            if (sumOfRow > maxSum) {
                maxSum = sumOfRow;
                resultRow = i;
            }
        }
        System.out.println("row -> "+resultRow);
        System.out.println("maxSum -> "+maxSum);
    }
}
