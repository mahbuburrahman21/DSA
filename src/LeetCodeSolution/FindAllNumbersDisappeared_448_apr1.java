package LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared_448_apr1 {
    static void main() {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            int idx = Math.abs(arr[i]) -1;
            if(arr[idx] < 0)
                continue;
            arr[idx] *= -1;
        }
        for(int j=0; j<n; j++){
            if(arr[j] > 0) list.add(j+1);
        }
        return list;
    }
}
