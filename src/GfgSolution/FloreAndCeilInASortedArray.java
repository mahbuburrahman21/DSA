package GfgSolution;

public class FloreAndCeilInASortedArray {
    static void main(String[] args) {
        //int[] arr ={1,2,4,10,10,12,19};
        //int[] arr ={-3,-2,-1,0,0,0,0,0,0,1,2};
        int[] arr ={-2,-1,-1,-10,0,0,1,2,3,4,4};
        System.out.println(lowerBound(arr));
        System.out.println(upperBound(arr));
        System.out.println(maximumCount(arr));
    }
    // Return the first index where the value is equal to or greater than zero.
    private static int lowerBound(int[] nums) {
        int start = 0, end = nums.length - 1;
        int index = nums.length;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] < 0) {
                start = mid + 1;
            } else if (nums[mid] >= 0) {
                end = mid - 1;
                index = mid;
            }
        }

        return index;
    }

    // Return the first index where the value is greater than zero.
    private static int upperBound(int[] nums) {
        int start = 0, end = nums.length - 1;
        int index = nums.length;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] <= 0) {
                start = mid + 1;
            } else if (nums[mid] > 0) {
                end = mid - 1;
                index = mid;
            }
        }

        return index;
    }

    public static int maximumCount(int[] nums) {
        // All integers from the first non-zero to last will be positive
        // integers.
        int positiveCount = nums.length - upperBound(nums);
        // All integers from the index 0 to index before the first zero index
        // will be negative.
        int negativeCount = lowerBound(nums);

        return Math.max(positiveCount, negativeCount);
    }

}
