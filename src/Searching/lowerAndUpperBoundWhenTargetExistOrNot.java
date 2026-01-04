package Searching;

public class lowerAndUpperBoundWhenTargetExistOrNot {
    static void main(String[] args) {
        //int[] arr = {1,2,4,12,14,14,14,14,14,14,14,15,19};
        int[] arr = {1,2,4,12,15,19};
        System.out.println(targetFinding(arr,14));
    }

    public static int upperBoundTargetExist(int[] arr, int tar){
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        while (start <= end){
            int mid = (start+end)/2;
            if (arr[mid] < tar) start = mid+1;
            else if (arr[mid] > tar) end = mid-1;
            else {
                index = mid;
                start = mid+1;
            }
        }
        return index;
    }

    public static int targetFinding(int[] arr, int tar) {
        int st = 0, end = arr.length - 1;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == tar) {
                ans = mid;     // save index
                st = mid + 1;  // move right for last occurrence
            }
            else if (arr[mid] > tar) {
                end = mid - 1; // just move left, DON'T update ans
            }
            else { // arr[mid] < tar
                st = mid + 1; // move right
            }
        }

        // If target NOT found, st is now the smallest index where arr[st] > tar
        if (ans == -1) {
            return (st < arr.length) ? st : -1;
        }
        return ans;
    }

}
