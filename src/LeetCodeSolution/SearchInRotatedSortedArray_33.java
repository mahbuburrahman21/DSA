package LeetCodeSolution;

public class SearchInRotatedSortedArray_33 {
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
        int n = arr.length-1;
        int pivot = pivotElement(arr);
        int ans = -1;
        if (pivot == 0){
            int start = 0, end = n;
            while (start <= end){
                int mid = start + (end-start)/2;
                if (arr[mid] == target) return mid;
                else if (arr[mid] > target) end = mid-1;
                else start = mid+1;
            }
        }
        else {
            //Binary Search in first part
            int start1 = 0, end1 = pivot-1;
            while (start1 <= end1){
                int mid = start1 + (end1-start1)/2;
                if (arr[mid] == target) return mid;
                else if (arr[mid] > target) end1 = mid-1;
                else start1 = mid+1;
            }

            //Binary Search in second part
            int start2 = pivot, end2 = n;
            while (start2 <= end2){
                int mid = start2 + (end2-start2)/2;
                if (arr[mid] == target) return mid;
                else if (arr[mid] > target) end2 = mid-1;
                else start2 = mid+1;
            }
        }
        return ans;
    }



    public static int pivotElement(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        //If array is not rotated.
        if (arr[start] <= arr[end])
            return 0;


        while (start <= end){
            int mid = start + (end - start)/2;

            //safe boundary check
            if ( mid > 0 && arr[mid] < arr[mid-1])
                return mid;
            if (mid < n-1 && arr[mid] > arr[mid+1])
                return mid+1;

            //decide search space
            if (arr[mid] >= arr[start])
                start = mid+1;
            else
                end = mid-1;
        }
        return 0;
    }
}
