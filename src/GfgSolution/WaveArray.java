package GfgSolution;

import Arrays.ArrayUtility;

public class WaveArray {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {1};
        int[] arr2 = {2,34,56,78,122,234,566,778,890};
        sortInWave(arr);
        sortInWave(arr1);
        sortInWave(arr2);
        ArrayUtility.displayArray(arr);
        ArrayUtility.displayArray(arr1);
        ArrayUtility.displayArray(arr2);

    }
    public static void sortInWave(int[] arr) {
        // code here
        int n = arr.length;
        if(n > 1){
            int i=0;
            int j=1;
            while(j<n){
                swap(arr, i, j);
                i+=2;
                j+=2;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
