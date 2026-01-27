package LeetCodeSolution;

public class MissingNumber_268_apr2 {
    static void main() {
        //int[] arr = {9,7,4,2,3,5,6,0,1};
        //int[] arr = {8,7,4,2,3,5,6,0,1};
        int[] arr = {8,7,4,2,3,5,6,9,1};
        //int[] arr = {0,2};
        int ans =  missingNumber(arr);
        System.out.println(ans);
    }

    public static int missingNumber(int[] nums) {
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums.length;
    }

    private static void cyclicSort(int[] arr){
        int i=0;
        int n = arr.length;
        while (i< n){
            if (arr[i] == i || arr[i] == n) i++;
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
