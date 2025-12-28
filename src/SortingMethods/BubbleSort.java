package SortingMethods;

import GfgSolution.WaveArray;
import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args){
        int[] arr = {5,2,4,1,3,3,8,9,1,2,1,7,6};
        //BubbleSort 1st approach
        int n = arr.length;
        for (int k = 0; k < n; k++) {
            int i =0;
            int j =1;
            for (int l = 0; l < n-k-1; l++) {
                if (arr[i]>arr[j]){
                    WaveArray.swap(arr, i, j);
                }
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));



        int[] arr1 = {5,2,4,1,3,3,8,9};
        //BubbleSort 2nd approach
        int x = arr1.length;
        for (int i = 0; i < x-1; i++) {
            for (int j = 0; j < x-1-i; j++) {
                if (arr1[j] > arr1[j+1]){
                    WaveArray.swap(arr1, j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr1));



        int[] arr2 = {5,2,4,1,3};
        //BubbleSort 3rd approach (best)
        int m = arr2.length;
        for (int i = 0; i < m-1; i++) {
            //check the array is already sorted or not in every pass.
            boolean isSored = true;
             for(int k = 0; k<m-1; k++){
                 if(arr[k]>arr[k+1]){
                     isSored = false;
                     break;
                 }
             }
             if (isSored) break;
            for (int j = 0; j < m-1-i; j++) {
                if (arr2[j] > arr2[j+1]){
                    WaveArray.swap(arr2, j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr2));


        int[] arr3 = {5,2,4,1,3};
        //BubbleSort 4th approach (another best way)
        int p = arr3.length;
        for (int i = 0; i < p-1; i++) {
            //check the array is already sorted or not in every pass.
            int swaps = 0;
            for (int j = 0; j < p-1-i; j++) {
                if (arr3[j] > arr3[j+1]){
                    WaveArray.swap(arr3, j, j+1);
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
        System.out.println(Arrays.toString(arr3));



        int[] arr4 = {5,2,4,1,3};
        //BubbleSort 5th approach (another more the best way)
        int q = arr4.length;
        for (int i = 0; i < q-1; i++) {
            //check the array is already sorted or not in every pass.
            boolean isSorted = true;
            for (int j = 0; j < q-1-i; j++) {
                if (arr4[j] > arr4[j+1]){
                    WaveArray.swap(arr4, j, j+1);
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
        System.out.println(Arrays.toString(arr4));



        int[] arr5 = {5,2,4,1,3};
        //Descending or decreasing order ->
        int r = arr5.length;
        for (int i = 0; i < r-1; i++) {
            //check the array is already sorted or not in every pass.
            boolean isSorted = true;
            for (int j = 0; j < r-1-i; j++) {
                if (arr5[j] < arr5[j+1]){
                    WaveArray.swap(arr5, j, j+1);
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
        System.out.println(Arrays.toString(arr5));



        int[] arr6 = {1,0,2,3,0,4,8,0,10,12};
        //Move all zeros to the end ->
        int s = arr6.length;
        for (int i = 0; i < s-1; i++) {
            //check the array is already sorted or not in every pass.
            boolean isSorted = true;
            for (int j = 0; j < s-1-i; j++) {
                if (arr6[j] < arr6[j+1]){
                    WaveArray.swap(arr6, j, j+1);
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
        System.out.println(Arrays.toString(arr6));


        int[] arr7 = {1,0,2,3,0,4,8,0,10,12};
        //Move all zeros to the end without changing the order ->
        int t = arr7.length;
        for (int i = 0; i < t-1; i++) {
            //check the array is already sorted or not in every pass.
            boolean isSorted = true;
            for (int j = 0; j < t-1-i; j++) {
                if (arr7[j] == 0){
                    WaveArray.swap(arr7, j, j+1);
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
        System.out.println(Arrays.toString(arr7));

    }
}
//System.out.printf("swap -> %d, %d\n\n", arr[j], arr[i]);
//System.out.printf("swap -> %d, %d\n\n", arr[j], arr[i]);
//System.out.printf("i -> %d, j -> %d, l -> %d\n", i,j,l);