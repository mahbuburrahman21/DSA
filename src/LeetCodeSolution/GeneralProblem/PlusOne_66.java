package LeetCodeSolution.GeneralProblem;
import Arrays.ArrayUtility;


public class PlusOne_66 {
    static void main(String[] args) {
        //int[] digits = {1,2,3};
        //int[] digits = {9,9,9};
        //int[] digits = {9,9,9,9};
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] ar = plusOne(digits);
        ArrayUtility.displayArray(ar);
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i >= 0; i--) {
            if (digits[i]<9){
                digits[i]++; // no carry needed
                return digits;
            }
            digits[i] = 0;
        }
        //If all digits were 9 -> new array with leading 1
        int[] newArr = new int[n+1];
        newArr[0] = 1;
        return newArr;
    }
}