package LeetCodeSolution.GeneralProblem;

public class FirstAndLastPositionBS_34 {
    static void main(String[] args) {

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
