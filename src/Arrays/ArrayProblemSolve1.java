package Arrays;

import static Arrays.ArrayUtility.displayArray;
import static Arrays.ArrayUtility.displayArray;

//Multiply odd indexes elements by 2 and add 10 to even indexed elements.
public class ArrayProblemSolve1 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        //output -> 11 4 13 8 15 12 17
            for (int i = 0; i < arr.length; i++) {
               if (i%2==0) arr[i] += 10;
               else arr[i] *= 2;
            }
            displayArray(arr);
        }

//    public static void printArr(int[] arr){
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//        System.out.println();
//    }
}



