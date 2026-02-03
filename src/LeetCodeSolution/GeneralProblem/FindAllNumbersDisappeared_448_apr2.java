package LeetCodeSolution.GeneralProblem;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared_448_apr2 {
    static void main() {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int i=0;
        while (i < n){
            int rightIdx = arr[i]-1;
            if (arr[i] == i+1 || arr[rightIdx] == arr[i]) i++;
            else swap(i,rightIdx,arr);
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j+1) list.add(j+1);
        }
        return list;
    }

    private static void swap(int i, int idx, int[] arr){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
