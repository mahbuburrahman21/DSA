package LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_II_119_apr2 {
    static void main(String[] args) {
        System.out.println(getRow(5));
    }

    public static List<Integer> getRow(int rowIndex) {
        int n = rowIndex + 1;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> arr = new ArrayList<>();
            //list.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                arr.add(1);
            }
            list.add(arr);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                //int index = list.get(i).get(j);
                if (j==0 || j==i) list.get(i).set(j,1);
                else {
                    int value = list.get(i-1).get(j) + list.get(i-1).get(j-1);
                    list.get(i).set(j, value);
                }
            }
        }
        return list.get(rowIndex);
    }
}
