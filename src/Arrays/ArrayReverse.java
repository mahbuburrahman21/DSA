package Arrays;
import static Arrays.ArrayUtility.displayArray;

public class ArrayReverse {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[(n-1)-i];
            arr[(n-1)-i] = temp;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
