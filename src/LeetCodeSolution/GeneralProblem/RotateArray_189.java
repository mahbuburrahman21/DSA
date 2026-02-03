package LeetCodeSolution.GeneralProblem;

import Arrays.ArrayUtility;

import java.util.Scanner;

public class RotateArray_189 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //int[] arr = {0,1,2,3,4,5,6};
        int n = arr.length;
        System.out.print("Enter number of rotation: ");
        int k = input.nextInt();
        k = k%n;

        //left shift==================================
//        swap(arr, 0,k-1);
//        swap(arr, k,n-1);
//        swap(arr, 0, n-1);
//        ArrayUtility.displayArray(arr);
        //============================================


        //right shift=================================
        swap(arr, 0,n-k-1);
        swap(arr, n-k,n-1);
        swap(arr, 0, n-1);
        ArrayUtility.displayArray(arr);
        //============================================

        //ArrayUtility.displayArray(leftShiftNewArr);
        //ArrayUtility.displayArray(rightShiftNewArr);
    }
    public static void swap(int[] arr, int i, int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}