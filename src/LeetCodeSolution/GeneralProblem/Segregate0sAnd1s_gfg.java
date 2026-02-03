package LeetCodeSolution.GeneralProblem;

public class Segregate0sAnd1s_gfg {
    static void main() {
        int[] nums = {0,1,0,1,0,0,1};
        moveZeroes(nums);
        System.out.print("{ ");
        for (int x : nums){
            System.out.printf("%d ", x);
        }
        System.out.print("}\n");
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0; //i = right;
        int j=0; // j = left;
        while(j<n){
            if(nums[j]==0){
                swap(nums, i, j);
                j++;
                i++;
            } else j++;
        }
    }
    private static void swap(int[] nums ,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
