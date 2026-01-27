package GfgSolution;

import java.util.ArrayList;

public class ArrayDuplicates {
    static void main() {
        int[] arr1 = {5,2,3,1,2,3,5};
        int[] arr2 = {3,1,3,4,2};
        int[] arr3 = {};
        int[] arr4 = {7,10,2,8,9,8,5,5,3,7,3,10};
        int[] arr5 = {3,2,3};
        int[] arr6 = {4,2,1,4};
        System.out.println(findDuplicates(arr1));
        System.out.println(findDuplicates(arr2));
        System.out.println(findDuplicates(arr3));
        System.out.println(findDuplicates(arr4));
        System.out.println(findDuplicates(arr5));
        System.out.println(findDuplicates(arr6));
    }
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> list  = new ArrayList<>();
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