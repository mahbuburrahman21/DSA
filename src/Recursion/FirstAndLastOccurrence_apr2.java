package Recursion;

import java.util.ArrayList;

public class FirstAndLastOccurrence_apr2 {
    static void main() {
        //int[] arr = {1,4,6,7,7,7,7,7,7,23,45,67,67,67,67,67,67,89,99,100};
        //int[] arr = {5, 7, 7, 7, 8, 8, 8, 8};
        int[] arr = {10, 10, 12, 13, 13, 16, 18, 18, 18, 21};
        //int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println("Arr Length -> "+arr.length);
        ArrayList<Integer> list = find(arr,13);
        System.out.println(list);
    }
    public static ArrayList<Integer> find(int[] arr, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        list.add(lowerBound(arr, x, 0, n - 1));
        list.add(upperBound(arr, x, 0, n - 1));

        return list;
    }


    public static int lowerBound(int[] nums, int target, int start, int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            int left = lowerBound(nums, target, start, mid - 1);
            if (left == -1) return mid;
            else return left;
        }
        else if (nums[mid] > target) {
            return lowerBound(nums, target, start, mid - 1);
        }
        else {
            return lowerBound(nums, target, mid + 1, end);
        }
    }



    public static int upperBound(int[] nums, int target, int start, int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            int right = upperBound(nums, target, mid + 1, end);
            if (right == -1) return mid;
            else return right;
        }
        else if (nums[mid] > target) {
            return upperBound(nums, target, start, mid - 1);
        }
        else {
            return upperBound(nums, target, mid + 1, end);
        }
    }
}
