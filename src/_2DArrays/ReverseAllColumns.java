package _2DArrays;

public class ReverseAllColumns {
    static void main() {
        int[][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
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

        //2D array output
        for (int[] ints : arr) {
            for (int j = 0; j < col; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
    }

    public static void swap(int[][] arr, int i, int j, int rowIdx){
        int temp = arr[i][j];
        arr[i][j] = arr[rowIdx][j];
        arr[rowIdx][j] = temp;
    }
}
