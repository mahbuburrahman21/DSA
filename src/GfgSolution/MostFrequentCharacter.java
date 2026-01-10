package GfgSolution;

import java.util.Arrays;

public class MostFrequentCharacter {
    static void main() {
        String str = "character";
        System.out.println(getMaxOccurringChar(str));
    }

    //Approach 1 ---> (Brute Force)
//    public static char getMaxOccurringChar(String s) {
//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//
//        int maxFreq = 0;
//        int count = 1;
//        char ans = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == arr[i - 1]) {
//                count++;
//            } else {
//                count = 1;
//            }
//
//            // Update answer
//            if (count > maxFreq || (count == maxFreq && arr[i] < ans)) {
//                maxFreq = count;
//                ans = arr[i];
//            }
//        }
//        return ans;
//    }


    //Approach 2 ---> (little better T.C.)
//    public static char getMaxOccurringChar(String s) {
//        int n = s.length();
//        int maxFreq = -1;
//        char ans = s.charAt(0);
//
//        for (int i = 0; i < n; i++) {
//            int freq = 1;
//            char ch = s.charAt(i);
//            for (int j = 0; j < n; j++) {
//                if (s.charAt(j) == ch) freq++;
//            }
//            if (freq > maxFreq){
//                maxFreq = freq;
//                ans = ch;
//            } else if (freq == maxFreq && ch<ans) {
//                ans = ch;
//            }
//        }
//        return ans;
//    }

    //Approach 3 ---> (Sliding Window)
//    public static char getMaxOccurringChar(String s) {
//        int n = s.length();
//        int maxFreq = -1;
//        char ans = s.charAt(0);
//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//
//        int i = 0, j = 0;
//        while (j<n){
//            if (arr[i]==arr[j]) j++;
//            else {
//                int freq = j-i;
//                if (freq > maxFreq){
//                    maxFreq = freq;
//                    ans = arr[i];
//                }
//                i = j;
//            }
//        }
//        int freq = j-i;
//        if (freq > maxFreq){
//            ans = arr[i];
//        }
//
//        return ans;
//    }

    //Approach 5 ---> (Best approach using Frequency Array)
    public static char getMaxOccurringChar(String str){
        int[] freq = new int[26];
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int index = ch-97;
            freq[index]++;
        }
        //System.out.println("e -> "+freq[4]);

        int maxFreqIndex = 0;
        int m = freq.length;
        for (int i = 0; i < m; i++) {
            if (freq[maxFreqIndex] < freq[i]) maxFreqIndex = i;
        }
        return (char)(maxFreqIndex+97);
    }
}
