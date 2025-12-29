package SortingMethods;

import GfgSolution.WaveArray;
import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {


        //Sort the array in ascending order.
        //int[] arr = {7,4,5,9,8,3,2};
        int[] arr = {7,3,4,7,8,1};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[min]) min = j;
            }
            if (min != i) {
                WaveArray.swap(arr, i, min);
            }
        }
        System.out.println(Arrays.toString(arr));




        //Sort the array in descending order.
        int[] arr1 = {7,4,5,9,8,3,2};
        int m = arr1.length;
        for (int i = 0; i < m-1; i++) {
            int max = i;
            for (int j = i+1; j < m; j++) {
                if (arr1[j]>arr1[max]) max = j;
            }
            if (max != i) {
                WaveArray.swap(arr1, i, max);
            }
        }
        System.out.println(Arrays.toString(arr1));


    }
}