package Searching;

import java.util.Scanner;

public class BinarySearchFirstOccurrence {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the target value to find in array: ");
        int target = input.nextInt();
        int[] nums = {1,1,1,1,2};
        int isFound = binarySearch(nums, target);
        if (isFound == -1) System.out.println("Target not found.");
        else System.out.printf("%d found in index: %d", target, isFound);
    }
    public static int binarySearch(int[] nums, int target) {
        int st = 0;
        int end = nums.length-1;
        while (st <= end){
            int mid = st+(end-st)/2;
            if (target > nums[mid]){
                st = mid+1;
            } else if (target < nums[mid]) {
                end = mid-1;
            } else if (target == nums[mid]) {
                while(mid>st){ // Return the lowest index if multiple occurrence happen.
                    if(nums[mid-1]==nums[mid]){
                        mid--;
                    }else break;
                }
                return mid;
            }
        }
        return -1;
    }
}
