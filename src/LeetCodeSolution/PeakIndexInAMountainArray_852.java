package LeetCodeSolution;

public class PeakIndexInAMountainArray_852 {
    static void main(String[] args) {
        //int[] arr = {0,1,10,15,2};
        //int[] arr = {0,1,0};
        //int[] arr = {0,10,5,2};
        int[] arr = {3,5,3,2,0};

        int peakIndex = peakIndexInMountainArray(arr);
        int peakIndex2 = peakIndexInMountainArrayMyApproach(arr);
        System.out.printf("peak index: %d\npeak value: %d\n", peakIndex,arr[peakIndex]);
        System.out.printf("peak index: %d\npeak value: %d\n", peakIndex2,arr[peakIndex2]);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int st = 0;
        int end = arr.length-1;

        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < arr[mid + 1]) st = mid + 1;
            else end = mid;
        }
        return st;
    }

    public static int peakIndexInMountainArrayMyApproach(int[] arr) {
        int st = 1;
        int end = arr.length-2;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) return mid;
            else end = mid-1;
        }
        return st;
    }
}







//System.out.printf("st -> %d\nend -> %d\nmid -> %d\n\n", st,end,mid);
