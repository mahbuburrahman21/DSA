package Recursion;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length-1;
        System.out.println(Arrays.toString(revArray(arr,0, n)));
        System.out.println(Arrays.toString(arr));
    }

    private static int[] revArray(int[] arr, int start, int end){
        if (start<end) return arr;
        swap(arr,start,end);
        return revArray(arr, start+1, end-1);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}