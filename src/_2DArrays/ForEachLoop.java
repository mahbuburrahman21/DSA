package _2DArrays;

public class ForEachLoop {
    static void main() {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
//        int row = arr.length;
//        int col = arr[0].length;

        for (int[] ints : arr) {
            for (int ele : ints) {
                System.out.print(ele + "  ");
            }
            System.out.println();
        }

    }
}
