package Arrays;


public class MergeTwoSortedArray {
    static void main(String[] args) {
        int[] a={2,5,6,9,20};
        int[] b={1,3,4,5,7,8};
        int[] c= new int[a.length+ b.length];

        ArrayUtility.displayArray(c);
        merge(c,a,b);
        ArrayUtility.displayArray(c);


    }

    private static void merge(int[] c, int[] a, int[] b) {
        int i=0, j=0, k=0;
        while (i< a.length && j< b.length){
            if (a[i]<b[j]){
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
            // This can be also written as
            // if (a[i]<b[j])
            //    c[k++] = a[i++];
            // else
            //    c[k++] = b[j++];
//            if (i==a.length){ // (a) array is finished. So copy the rest of element from b
//                while (j<b.length){
//                    c[k++] = b[j++];
//                }
//            }
//            if (j==b.length){ // (b) array is finished. So copy the rest of element from a
//                while (i<a.length){
//                    c[k++] = a[i++];
//                }
//            }
            while (j<b.length){
                c[k++] = b[j++]; //post increment. first use the value then increment
            }
            while (i<a.length){
                c[k++] = a[i++]; //post increment. first use the value then increment
            }
        }
    }
}