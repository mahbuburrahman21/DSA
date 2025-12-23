package Arrays;

public class ArrayReverseTwoPointerTechnique {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
    //if we want to reverse a small part of the array
    //let, arr = {10,20,30,40,50};
    //after reverse = {10,40,30,20,50}
    //just initialize i from 1 index and j from 3 index

}
