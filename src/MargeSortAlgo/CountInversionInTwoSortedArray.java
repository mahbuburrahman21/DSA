package MargeSortAlgo;

public class CountInversionInTwoSortedArray {
    static void main() {
        int[] a = {2,4,6,7};
        int[] b = {1,3,4,8};
        int i=0, j=0;
        int count = 0;
        while (true){
            if (a[i] > b[j])
                j++;
            else {
                count += j;
                i++;
            }
            if (i == a.length) break;
            if (j == b.length) {
                count += j;
                break;
            }
        }
        System.out.println(count);
    }
}