package Recursion;

public class BinarySearchUsingRecursion {
    static void main(String[] args) {
        int[] arr ={1,3,5,7,9,34,65,89,100};
        System.out.println(search(arr,9));
    }

    public static int helper(int[] nums, int target, int start, int end) {
        if(start > end) return -1;
        int mid = start + (end -  start)/2;
        if(nums[mid] == target) return mid; //else if(arr[mid] > target) end = mid-1;
        else if(nums[mid] > target)  return helper(nums, target, start, mid-1); //start to mid-1;  //else start = mid+1;
        else return helper(nums, target, mid+1, end); //mid+1 to end;
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        return helper(nums, target, 0, n-1);
    }
}
