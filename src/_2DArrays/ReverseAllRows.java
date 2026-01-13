package _2DArrays;

public class ReverseAllRows {
    static void main() {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int row = arr.length;
        int col = arr[0].length;
        int flag = col/2;

        for (int i = 0; i < row; i++) {
            int colIdx = arr[0].length;
            for (int j = 0; j < col; j++) {
                if (j<flag){
                    swap(arr, i, j, colIdx);
                    colIdx--;
                }
            }
        }
        for (int[] ints : arr) {
            for (int j = 0; j < col; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
    }

    public static void swap(int[][] arr, int i, int j, int colIdx){
        int temp = arr[i][j];
        arr[i][j] = arr[i][colIdx-1];
        arr[i][colIdx-1] = temp;
    }
}
