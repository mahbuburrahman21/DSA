package Arrays;
import Arrays.ArrayUtility.*;

import java.util.Scanner;

import static Arrays.ArrayUtility.displayArray;

public class LinearSearch {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr =  {12,23,34,4,5,7,8,34,65,45,23,89,90,20,50,60,10,40,45,10};
        System.out.print("Enter the element to search: ");
        int target = input.nextInt();
        //int target = 35;
        boolean flag = false;
        int index = 0;
        //displayArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) System.out.printf("%d element found in index %d", target,index);
        else System.out.printf("%d element not found", target);
    }
}
