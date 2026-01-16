package GfgSolution;

import java.util.Arrays;

public class MultiplyMatrices {
    static void main() {
//        int[][] A = {{7,8}, {2,9}};
//        int[][] B = {{14,5}, {5,18}};
//        int[][] C = {{0,0}, {0,0}};
//        multiply(A,B,C,2);
        int [][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] B = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] C = {{0,0,0},{0,0,0},{0,0,0}};
        multiply(A,B,C,3);
        //  30  36  42
        //  66  81  96
        // 102 126 150
    }
    public static void multiply(int[][] A, int[][] B, int[][] C, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k]*B[k][j];
                }
                //System.out.print(C[i][j]+"  ");
            }
            //System.out.println();
        }




//        System.out.println(Arrays.deepToString(C));
//        //row --> 0
//        C[0][0] += A[0][0]*B[0][0];
//        C[0][0] += A[0][1]*B[1][0];
//        C[0][0] += A[0][2]*B[2][0];
//        System.out.print(C[0][0]+"  ");
//
//        C[0][1] += A[0][0]*B[0][1];
//        C[0][1] += A[0][1]*B[1][1];
//        C[0][1] += A[0][2]*B[2][1];
//        System.out.print(C[0][1]+"  ");
//
//        C[0][2] += A[0][0]*B[0][2];
//        C[0][2] += A[0][1]*B[1][2];
//        C[0][2] += A[0][2]*B[2][2];
//        System.out.print(C[0][2]+"  ");
//        System.out.println();
//
//
//        //row --> 1
//        C[1][0] += A[1][0]*B[0][0];
//        C[1][0] += A[1][1]*B[1][0];
//        C[1][0] += A[1][2]*B[2][0];
//        System.out.print(C[1][0]+"  ");
//
//        C[1][1] += A[1][0]*B[0][1];
//        C[1][1] += A[1][1]*B[1][1];
//        C[1][1] += A[1][2]*B[2][1];
//        System.out.print(C[1][1]+"  ");
//
//        C[1][2] += A[1][0]*B[0][2];
//        C[1][2] += A[1][1]*B[1][2];
//        C[1][2] += A[1][2]*B[2][2];
//        System.out.print(C[1][2]+"  ");
//        System.out.println();
//
//
//        //row --> 2
//        C[2][0] += A[2][0]*B[0][0];
//        C[2][0] += A[2][1]*B[1][0];
//        C[2][0] += A[2][2]*B[2][0];
//        System.out.print(C[2][0]+"  ");
//
//        C[2][1] += A[2][0]*B[0][1];
//        C[2][1] += A[2][1]*B[1][1];
//        C[2][1] += A[2][2]*B[2][1];
//        System.out.print(C[2][1]+"  ");
//
//        C[2][2] += A[2][0]*B[0][2];
//        C[2][2] += A[2][1]*B[1][2];
//        C[2][2] += A[2][2]*B[2][2];
//        System.out.print(C[2][2]+"  ");
//        System.out.println();

    }
}