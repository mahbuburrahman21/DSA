package MargeSortAlgo;

import java.util.Arrays;

public class MargeTwoSortedArray {
    static void main() {
        int[] a = {10,20,20,80,90,120};
        int[] b = {20,20,50,70,100,110,130,140};
        int m = a.length;
        int n = b.length;
        int[] c = new int[m+n];

        int i = 0, j = 0, k = 0;
        while (k<c.length){
            if (i<m && a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        System.out.println(Arrays.toString(c));
    }

}
