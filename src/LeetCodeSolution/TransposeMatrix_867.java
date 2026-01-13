package LeetCodeSolution;

public class TransposeMatrix_867 {
    static void main() {
        //int[][] arr = {{2,4,-1},{-10,5,11},{18,-7,6}};
        //int[][] arr = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int[][] ans = transpose(arr);
        int col = ans[0].length;

        //2D array output
        for (int[] an : ans) {
            for (int j = 0; j < col; j++) {
                System.out.print(an[j] + "  ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int rowMat = matrix.length;
        int colMat = matrix[0].length;
        int[][] arr = new int[colMat][rowMat];
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }
}
