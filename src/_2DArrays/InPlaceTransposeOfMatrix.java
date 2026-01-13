package _2DArrays;

public class InPlaceTransposeOfMatrix {
    static void main() {
        int[][] arr = {{2,4,-1},{-1,5,1},{8,-7,6}};
        //int[][] arr = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        //int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8},{1, 2, 3, 4}, {5, 6, 7, 8}};

        System.out.println("Before Transpose -> ");
        printArr(arr);

        System.out.println("After Transpose -> ");
        int[][] ans = transpose(arr);
        printArr(ans);
    }

    //Transpose of matrix square size
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
