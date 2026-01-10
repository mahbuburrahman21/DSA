package Strings;

public class FrequencyArray {
    static void main() {
        String s = "bbbbbccccccccaabbbeeeeeeeeeeeeeeeeeebbbccccccccdddjjjhhgffffkkkgffffffffffffffffffffffffffffffffffffffffffffffffffffffff";
        System.out.println(mostFrequentChar(s));
    }
    public static char mostFrequentChar(String str){
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

