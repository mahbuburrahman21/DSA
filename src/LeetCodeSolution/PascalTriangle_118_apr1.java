package LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118_apr1 {
    static void main(String[] args) {

    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) arr.get(i).add(j,1); // arr[i][j] = 1 --> arr.get(i).set(j,1)
                else {
                    // arr[i][j] = arr[i-1][j] + arr[i-1][j-1] --> arr.get(i).set(j,arr.get(i-1).get(j) + arr.get(i-1).get(j-1))
                    arr.get(i).add(j,arr.get(i-1).get(j) + arr.get(i-1).get(j-1));
                }
            }
        }
        return arr;
    }
}
