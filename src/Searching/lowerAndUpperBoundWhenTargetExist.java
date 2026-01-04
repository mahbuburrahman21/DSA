package Searching;

public class lowerAndUpperBoundWhenTargetExist {
    static void main(String[] args) {
        //int[] arr ={1,2,4,10,10,12,19};
        int[] arr ={-3,-2,-1,0,0,0,0,0,0,1,2};
        System.out.println(upperBoundTargetExist(arr,0));
        System.out.println(lowerBoundTargetExist(arr,0));
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

    public static int lowerBoundTargetExist(int[] arr, int tar){
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        while (start <= end){
            int mid = (start+end)/2;
            if (arr[mid] < tar) start = mid+1;
            else if (arr[mid] > tar) end = mid-1;
            else {
                index = mid;
                end = mid-1;
            }
        }
        return index;
    }
}
