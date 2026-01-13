package _2DArrays;

import java.util.Scanner;

public class InputOutput2DArray {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int row = arr.length;
        int col = arr[0].length;

        // 2D array input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter the element in [%d][%d] --> ",i,j);
                arr[i][j] = input.nextInt();
            }
        }

        //2D array output
        for (int[] ints : arr) {
            for (int j = 0; j < col; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
    }
}
