package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchFirstAndLastIndex {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the target value to find in array: ");
        int target = input.nextInt();
        //int[] nums = {1,1,1,1,2,2,2,3,4,5,5,5,5,5,7,8,8,8,9,9};
        int[] nums = {1,1,1,1,2,2,2,3,4,5,5,5,5,5,7,8,8,8,9,9,10,12,13};
        //int[] nums = {};
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }
    public static int[] searchRange(int[] nums, int target) {

        int[] arr = {-1,-1};

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
                arr[0] = mid;

                while(mid<end){ // Return the Highest index if multiple occurrence happen.
                    if(nums[mid+1]==nums[mid]){
                        mid++;
                    }else break;
                }
                arr[1] = mid;
                return arr;
            }
        }
        return arr;
    }
}
