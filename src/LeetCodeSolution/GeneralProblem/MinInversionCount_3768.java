package LeetCodeSolution.GeneralProblem;
//\\===========================Important=============================//\\
//Although this code is correct.
//But this approach is not optimized for large input.
//Time Complexity:
//Copy k elements → O(k)
//Merge sort + inversion count → O(k log k)
//Number of windows → O(n)
//T.C. = O(n × k log k)
//
//This can be solved by,
//        1. Coordinate Compression
//2. Fenwick Tree (BIT)
//\\===============================================================//\\


public class MinInversionCount_3768 {
    static int count;
    static void main() {
        int[] nums = {5,2,8,4,1,6,7,3};
        long minimumCount = minInversionCount(nums, 3);
        System.out.println(minimumCount);
    }


    public static long minInversionCount(int[] nums, int k) {
        if(k==1) return 0;
        int minCount = Integer.MAX_VALUE;
        count = 0;

        //Sliding window
        int i = 0;
        int j = k;
        while (j <= nums.length) {
            int[] arr = new int[k];
            int idx = 0;
            for (int l = i; l < j; l++) {
                arr[idx++] = nums[l];
            }

            count = 0;
            mergeSort(arr);
            minCount = Math.min(minCount, count);

            i++;
            j++;
        }
        return minCount;
    }

    private static void mergeSort(int[] arr){
        int n = arr.length;
        if (n==1) return;

        //Step-1: Divide the array into two part
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        //Step-2: Copy the arr elements in a and b.
        int idx = 0;
        for (int i = 0; i < a.length; i++) a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++) b[i] = arr[idx++];

        //Step-3: Sort the divided arrays a and b.
        mergeSort(a);
        mergeSort(b);

        //Step-4: Now marge a and b. (a,b is already sorted)
        merge(a,b,arr);
    }

    //This method marge two sorted Array
    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        // Inversion count
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                count += (a.length - i); // this is counting the inversion
                c[k++] = b[j++];
            }
        }

        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
    }
}