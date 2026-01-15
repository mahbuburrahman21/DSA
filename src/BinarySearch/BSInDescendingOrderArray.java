package BinarySearch;

public class BSInDescendingOrderArray {
    static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        int target = 4;
        int isFound = bsInDescendingOrder(arr, target);
        if (isFound == -1) System.out.println(target +"Not found in array!");
        else System.out.printf("%d found in position: %d", target, isFound);
    }
    public static int bsInDescendingOrder(int[] arr, int target){
        int st = 0;
        int end = arr.length-1;
        while (st <= end){
            int mid = st + (end-st)/2;
            if (arr[mid] > target) st = mid+1;
            else if (arr[mid] < target) end = mid-1;
            else return mid;
        }
        return -1;
    }
}
