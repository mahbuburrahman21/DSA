void main() {
    int[] arr = {1,2,3,3,3,3,5,6,7,8,8,8,9};
    //int[] arr = {3,2,4};
    //Arrays.sort(arr); //{ 1,1,2,3,4,5,6,7,8,9 }
    System.out.println(upperBoundTargetExist(arr,3));
    System.out.println(lowerBoundTargetExist(arr,3));

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
