package MargeSortAlgo;

import java.util.Arrays;

public class MargeSort {
    static void main() {
        int[] arr = {5,2,9,1,6,8,4,7,3};
        margeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void margeSort(int[] arr){
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
        margeSort(a);
        margeSort(b);

        //Step-4: Now marge a and b. (a,b is already sorted)
        marge(a,b,arr);
    }

    //This method marge two sorted Array
    private static void marge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if (a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
    }
}
