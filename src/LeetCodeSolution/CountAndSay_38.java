package LeetCodeSolution;

public class CountAndSay_38 {
    static void main() {
        System.out.println(countAndSay(4));
    }


    public static String countAndSay(int n) {
        if (n==1) return "1";
        String s = countAndSay(n-1);
        //Read s
        StringBuilder ans = new StringBuilder();
        int m = s.length();
        int i = 0;
        int count = 1;

        while (i < m) {
            // Only compare with next character if it exists
            if (i + 1 < m && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                ans.append(count).append(s.charAt(i));
                count = 1;
            }
            i++;
        }
        return ans.toString();
    }
}
