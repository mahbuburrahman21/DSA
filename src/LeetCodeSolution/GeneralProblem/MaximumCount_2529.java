package LeetCodeSolution.GeneralProblem;

public class MaximumCount_2529 {
    static void main(String[] args) {
        //int[] arr= {-10,-9,-7,-3,-2,-1,-1,-1,-1,0,0,0,0,0,1,2,6,6,6,7,8,9,10,12,14,15};
        //int[] arr= {5,20,66,1314};
        int[] arr= {0,0};

        //System.out.println(arr.length);
        int neg = negCount(arr);
        //System.out.println(negIndex);
        int pos = posCount(arr);
        //System.out.println(posIndex);
        int ans = Math.max(pos, neg);
        System.out.println(ans);


    }
    public static int negCount(int[] arr){
        int start = 0, end = arr.length-1;
        int index = -1;

        while (start <= end){
            int mid = start+(end-start)/2;

            if (arr[mid]>=0) end = mid-1;
            else {
                start = mid+1;
                index = mid;
            }
        }
        return index+1;
    }
    public static int posCount(int[] arr){
        int start = 0, end = arr.length-1;
        int index = -1;

        while (start <= end){
            int mid = start+(end-start)/2;

            if (arr[mid] <= 0) start = mid+1;
            else {
                end = mid-1;
                index = mid;
            }
        }
        if (index == -1) return 0;
        else return arr.length-index;
        //return arr.length-index;
    }























        // Return the first index where the value is equal to or greater than zero.
//        private static int lowerBound(int[] nums) {
//            int start = 0, end = nums.length - 1;
//            int index = nums.length;
//
//            while (start <= end) {
//                int mid = (start + end) / 2;
//
//                if (nums[mid] < 0) {
//                    start = mid + 1;
//                } else if (nums[mid] >= 0) {
//                    end = mid - 1;
//                    index = mid;
//                }
//            }
//
//            return index;
//        }

        // Return the first index where the value is greater than zero. Or last occurrence of the value.
//        private static int upperBound(int[] nums) {
//            int start = 0, end = nums.length - 1;
//            int index = nums.length;
//
//            while (start <= end) {
//                int mid = (start + end) / 2;
//
//                if (nums[mid] <= 0) {
//                    start = mid + 1;
//                } else if (nums[mid] > 0) {
//                    end = mid - 1;
//                    index = mid;
//                }
//            }
//
//            return index;
//        }

//        public static int maximumCount(int[] nums) {
//            // All integers from the first non-zero to last will be positive
//            // integers.
//            int positiveCount = nums.length - upperBound(nums);
//            // All integers from the index 0 to index before the first zero index
//            // will be negative.
//            int negativeCount = lowerBound(nums);
//
//            return Math.max(positiveCount, negativeCount);
//        }

    }
