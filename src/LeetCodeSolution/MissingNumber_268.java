package LeetCodeSolution;

public class MissingNumber_268 {
    static void main(String[] args) {
        int[] arr = {3,0,1};
        int[] arr2 = {0,1};
        int[] arr3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumber(arr2));
        System.out.println(missingNumber(arr3));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int Sn = (n * (n+1)) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return Sn - sum;
    }
}
