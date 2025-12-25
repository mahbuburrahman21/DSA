package LeetCodeSolution;
import java.util.ArrayList;
public class PlusOne_66 {
    static void main(String[] args) {
        int[] digits = {9,9,8,7};
        plusOne(digits);
    }
    public static int[] plusOne(int[] digits) {

        int n = digits.length; // n = 3
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(10, n-1-i)*digits[i];
        }
        sum++;

        int size = 10;
        int[] newArr = new int[size];

        for (int i = 0; i < n; i++) {

        }

        System.out.println(sum);
        return null;
    }
}



//            System.out.printf("%d * 10^%d = %d\n", digits[i], n-1-i,(int) Math.pow(10, n-1-i)*digits[i]);
//            System.out.println(sum);
//            System.out.println();
