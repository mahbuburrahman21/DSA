package LeetCodeSolution.GeneralProblem;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    static void main() {
        int[][] arr = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,20},{21,22,23,24,25,26},{27,28,29,30,31,32}};
        List<Integer> list = spiralOrder(arr);
        System.out.println(list);
    }
    public static List<Integer> spiralOrder(int[][] arr) {

        List<Integer> list = new ArrayList<>();
        int fc = 0; // first column
        int lc = arr[0].length-1; // last column
        int fr = 0; // first row
        int lr = arr.length-1; // last row

        while (fr <= lr && fc <= lc) {
            // Left → Right
            for (int i = fc; i <= lc; i++) {
                //System.out.print(arr[fr][i] + " ");
                list.add(arr[fr][i]);
            }
            fr++;

            // Top → Bottom
            for (int i = fr; i <= lr; i++) {
                //System.out.print(arr[i][lc] + " ");
                list.add(arr[i][lc]);
            }
            lc--;

            // Right → Left (IMPORTANT CHECK)
            if (fr <= lr) {
                for (int i = lc; i >= fc; i--) {
                    //System.out.print(arr[lr][i] + " ");
                    list.add(arr[lr][i]);
                }
                lr--;
            }

            // Bottom → Top (IMPORTANT CHECK)
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    //System.out.print(arr[i][fc] + " ");
                    list.add(arr[i][fc]);
                }
                fc++;
            }
        }
        return list;
    }
}
