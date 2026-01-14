package LeetCodeSolution;

public class RotateImage_48 {
    static void main(String[] args) {
        int[][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println("Original --> ");
        printArr(arr);
        System.out.println("After reversing the rows --> ");
        reverseRow(arr);
        printArr(arr);
        System.out.println("After transpose --> ");
        transpose(arr);
        printArr(arr);
    }
    public static void rotate(int[][] matrix) {
        reverseRow(matrix);
        transpose(matrix);
    }

    //In place reversing all the rows.
    public static int[][] transpose(int[][] arr) {
        int row = arr.length; // row col has same value in square matrix.

        for (int j = 0; j < row; j++) { // column
            for (int i = j+1; i < row; i++) { // row
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    //Reverse rows
    public static int[][] reverseRow(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        for (int j = 0; j < col; j++) {
            int rowIdx = row-1;
            for (int i = 0; i < row; i++) {
                if (i < (row/2)){
                    swap(arr, i, j, rowIdx);
                    rowIdx--;
                }
            }
        }
        return arr;
    }

    //Swapping operation
    public static void swap(int[][] arr, int i, int j, int rowIdx){
        int temp = arr[i][j];
        arr[i][j] = arr[rowIdx][j];
        arr[rowIdx][j] = temp;
    }

    private static void printArr(int[][] arr){
        for (int[] a : arr){
            for (int ele : a) {
                System.out.print(ele+ "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
