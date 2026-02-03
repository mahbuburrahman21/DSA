package LeetCodeSolution.GeneralProblem;

public class SearchInRotatedSortedArray_33_apr2 {
    static void main(String[] args) {
        int[] arr1 = {3,4,5,6,7,8,9,0,1,2};
        int[] arr2 = {0,1,2,3};
        int[] arr3 = {7,8,9,10,0,1,2,3,4,5,6};
        int[] arr4 = {7,0,1,2,3,4,5,6};
        int[] arr5 = {4,5,6,7,0,1,2};
        int[] arr6 = {3,1};

        System.out.println(search(arr6, 1));
        //System.out.println("Pivot -> "+pivotElement(arr6));
    }
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n-1;
        while (start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid] == target) return mid;

            if (arr[start] <= arr[mid]){ //means left part is sorted.(start --> mid is sorted)
                // target can be found in left side
                if (arr[start] <= target && target < arr[mid]) end = mid-1;
                else start = mid+1; // target may be in other part.
            }
            else { // means right part is sorted. (mid --> end is sorted)
                // target can be found in right side
                if (arr[mid] < target && target <= arr[end]) start = mid+1;
                else end = mid-1; // target mey be in other part.
            }
        }
        return -1;
    }
}
