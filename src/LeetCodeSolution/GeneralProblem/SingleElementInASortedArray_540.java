package LeetCodeSolution.GeneralProblem;

public class SingleElementInASortedArray_540 {
    static void main(String[] args) {
        int[] arr1 = {1,1,2,3,3,4,4,8,8};
        int[] arr2 = {1,1,2,2,3,3,4,5,5,6,6};
        int[] arr3 = {3,3,7,7,10,10,11,11,12,12,24,24,56,56,100};
        int[] arr4 = {3,3,7,7,10,11,11};
        int[] arr5 = {7,7,10,11,11,12,12};
        int[] arr6 = {3};
        int[] arr7 = {1,1,3};
        int[] arr8 = {1,3,3};
        System.out.println("arr1 -> " + singleNonDuplicate(arr1));
        System.out.println("arr2 -> " + singleNonDuplicate(arr2));
        System.out.println("arr3 -> " + singleNonDuplicate(arr3));
        System.out.println("arr4 -> " + singleNonDuplicate(arr4));
        System.out.println("arr5 -> " + singleNonDuplicate(arr5));
        System.out.println("arr6 -> " + singleNonDuplicate(arr6));
        System.out.println("arr7 -> " + singleNonDuplicate(arr7));
        System.out.println("arr8 -> " + singleNonDuplicate(arr8));
    }
    public static int singleNonDuplicate(int[] arr) {

        int n = arr.length;
        if (n == 1) return arr[0];
        else if (arr[0] != arr[1]) return arr[0];
        else if (arr[n-1] != arr[n-2]) return arr[n-1];

        int start = 0;
        int end = n-1;



        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];
            int f = mid, s = mid;
            if (arr[mid - 1] == arr[mid]) f = mid - 1;
            else s = mid+1; // in case of this condition arr[mid] == arr[mid+1]

            int leftCount = f - start;
            //int rightCount = end - s;

            if (leftCount%2 == 0) start = s+1;
            else end = f-1;

        }
        return 0;
    }
}