package _2DArrays;

public class SnakePrintColumnWise {
    static void main() {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int row = arr.length;
        int col = arr[0].length;

        for (int j = 0; j < col; j++) {
            if (j%2 == 0){
                for (int i = 0; i < row; i++) {
                    System.out.print(arr[i][j]+"  ");
                }
            } else {
                for (int i = row-1; i >=0 ; i--) {
                    System.out.print(arr[i][j]+"  ");
                }
            }
            System.out.println();
        }
    }
}