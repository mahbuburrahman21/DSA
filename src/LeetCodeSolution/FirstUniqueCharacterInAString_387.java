package LeetCodeSolution;

public class FirstUniqueCharacterInAString_387 {
    static void main() {
        String str = "loveleetcode";
        //String str = "leetcode";
        System.out.println(firstUniqChar(str));
    }
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];

        int m = s.length();
        for (int i = 0; i < m; i++) {
            char ch = s.charAt(i);
            int index = ch-97;
            freq[index]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)-'a'] == 1) return i;
        }

        return -1;
    }
}
