package SortingMethods;

import java.util.Arrays;

public class CyclicSort {
    static void main() {
        int[] arr = {1,6,5,7,0,4,3,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void cyclicSort(int[] arr){
        int i=0;
        while (i< arr.length){
            if (arr[i] == i) i++;
            else {
                int idx = arr[i];
                swap(i,idx,arr);
            }
        }
    }
    private static void swap(int i, int idx, int[] arr){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
