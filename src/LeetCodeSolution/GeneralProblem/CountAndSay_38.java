package LeetCodeSolution.GeneralProblem;

public class CountAndSay_38 {
    static void main() {
        System.out.println(countAndSay(4));
        System.out.println(countAndSay_anotherCode(4));
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

    public static String countAndSay_anotherCode(int n) {
        if (n==1) return "1";
        String s = countAndSay(n-1);
        //Read s => 111221 -> 3 ta 1, 2 ta 2,  1 ta 1 = 312211
        StringBuilder ans = new StringBuilder();
        int m = s.length();
        for (int i = 0; i < m; ) {
            int count = 1;
            char current = s.charAt(i);

            // Count consecutive same characters
            while (i + 1 < m && s.charAt(i + 1) == current) {
                count++;
                i++;
            }

            ans.append(count).append(current);
            i++;  // move to next group
        }
        return ans.toString();
    }
}
