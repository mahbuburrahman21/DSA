package SortingMethods;
import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    static void main() {
        int[] arr = {4,1,17,31,9,2,0,8,6};
        ArrayList<Integer> adnan = new  ArrayList<>();
        adnan.add(100);
        adnan.add(5);
        adnan.add(85);
        adnan.add(4);
        adnan.add(6);
        adnan.add(4);
        //Insertion sorting Algorithm
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j]<arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(adnan);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
