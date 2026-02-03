package LeetCodeSolution.GeneralProblem;

public class KthMissingPositiveNumber_1539 {
    static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        //int[] arr = {1,2,3,4};
        System.out.println(findKthPositive(arr, 5));

    }

    //Optimal approach by binary search.
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start <= end){
            int mid = start + (end-start)/2;

            int missingTillMid = arr[mid] - (mid+1);

            if(missingTillMid < k){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return start+k;
    }

    //brute force approach
//    public static int findKthPositive(int[] arr, int k) {
//        int i = 0;
//        int j = 1;
//        int missing = 0;
//
//        while (missing < k){
//            if (i < arr.length && arr[i]==j){
//                i++;
//            } else {
//                missing++;
//                if (missing==k) return j;
//            }
//            j++;
//        }
//        return 0;
//    }
}
