package LeetCodeSolution;

import java.util.Arrays;

public class StringCompression_443_apr2 {
    static void main() {
        char[] arr = {'a','a','a','b','b','c','c','c','c'};
        //char[] arr = {'a','b','b','b','b','b','b','b','b','b','b','b','b',};
        //char[] arr = {'a'};
        System.out.println(compress(arr));
    }
    public static int compress(char[] arr) {
        int n = arr.length;
        int k = 0, i = 0, j = 0;
        while (j<n){
            if (arr[i] == arr[j]) j++;
            else {
                int length = j-i;
                arr[k++] = arr[i]; // k always move forward after assigning the char
                if (length > 1) { // don't add the length for 1 length
                    String s = String.valueOf(length); // Convert int to String
                    for (char c : s.toCharArray()){
                        arr[k++] = c; // iterate the String and add char to arr
                    }
                }
                i=j;
            }
            if (j==n){ // works only for last iteration. When j goes out of bound.
                int length = j-i;
                arr[k++] = arr[i]; // k always move forward after assigning the char
                if (length > 1) { // don't add the length for 1 length
                    String s = String.valueOf(length); // Convert int to String
                    for (char c : s.toCharArray()){
                        arr[k++] = c; // iterate the String and add char to arr
                    }
                }
            }
            System.out.printf("i -> %d\nj -> %d\n\n", i,j);
        }
        System.out.println(Arrays.toString(arr));
        return k;
    }
}



