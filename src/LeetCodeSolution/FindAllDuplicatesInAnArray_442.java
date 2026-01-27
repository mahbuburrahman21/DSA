package LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray_442 {
    static void main() {
        int[] arr1 = {1,4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr1));
    }

    public static List<Integer> findDuplicates(int[] arr) {
       List<Integer> list  = new ArrayList<>();
       int i=0;
       int n = arr.length;
       while (i<n){
           int rightIdx = arr[i]-1;
           if (arr[i] == i+1 || arr[i] == arr[rightIdx]) i++;
           else swap(i,rightIdx,arr);
       }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j+1) list.add(arr[j]);
        }

       return list;
    }

    private static void swap(int i, int idx, int[] arr){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
