package MargeSortAlgo;

import java.util.Arrays;

public class InversionCount {
    static int count;
    static void main() {
        int[] arr = {5,2,8,4,1,6,7,3};
        count = 0;
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Inversion Count = "+count);
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
    //This merger can be more optimized with this technique
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

    //This method show how merge method are counting the inversions.
    private static void mergeInversionProcess(int[] a, int[] b, int[] c){
        //Inversion Count ==========start ===============
        int l=0, m=0; // l -> i, m -> j
        while (true){
            if (a[l] > b[m])
                m++;
            else {
                count += m;
                l++;
            }
            if (l == a.length) break;
            if (m == b.length) {
                count += m;
                break;
            }
        }
        //Inversion Count ==========end ===============
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if (a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
    }
}
