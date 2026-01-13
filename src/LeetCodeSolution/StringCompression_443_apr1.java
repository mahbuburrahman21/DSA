package LeetCodeSolution;

import java.util.Arrays;

public class StringCompression_443_apr1 {
    static void main() {
//        char[] arr = {'a','a','b','b','c','c','c'};
        char[] arr = {'a','b','b','b','b','b','b','b','b','b','b','b','b',};
        //char[] arr = {'a'};
        System.out.println(compress(arr));
    }
    public static int compress(char[] arr) {
        StringBuilder str = new StringBuilder();
        int n = arr.length;

        int i=0, j=0;
        while (j < n){
            if (arr[i] == arr[j]){
                j++;
            }
            else {
                int length = j-i;
                str.append(arr[i]);
                if (length != 1) str.append(length);
                i=j;//reset i to j
            }
            if (j == n){
                int length = j-i;
                str.append(arr[i]);
                if (length != 1) str.append(length);

            }
        }
        for (int k = 0; k < str.length(); k++) {
            arr[k] = str.charAt(k);
        }
        System.out.println(Arrays.toString(arr));
        return str.length();
    }
}



