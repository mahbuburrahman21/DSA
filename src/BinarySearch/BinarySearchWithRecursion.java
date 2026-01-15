package BinarySearch;

import java.util.Scanner;

public class BinarySearchWithRecursion {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {-1,0,3,4,5,9,12};
        int st = 0;
        int end = arr.length-1;

        System.out.print("Enter the target value: ");
        int target = input.nextInt();
        int mid = binarySearch(arr, target, st, end);
        if (mid == -1) System.out.printf("The element %d not found", target);
        else System.out.printf("The element %d found in index: %d", target, mid);
    }

    public static int binarySearch(int[] arr, int target, int st, int end){
        if (st <= end){
            int mid = st + (end - st)/2;
            if (target > arr[mid]){
                return binarySearch(arr, target, mid+1, end);
            } else if (target < arr[mid]) {
                return binarySearch(arr, target, st, mid-1);
            } else
                return mid;
        }
        return -1;
    }
}
