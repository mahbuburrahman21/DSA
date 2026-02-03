package LeetCodeSolution.GeneralProblem;

public class ReverseWordsInAString_151 {
    static void main() {

        //System.out.println(reverse("Hello", 0,4));
        String  str = reverseWords("   the   sky is   blue");
        //String  str = reverseWords("  hello world    ");
        System.out.println(str);
        System.out.println();
    }


    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        int n = sb.length();
        int i=0, j=0;

        while (j != s.length()){
            while (j<n){
                if (sb.charAt(j) == ' '){
                    i=j+1;
                    j++;
                } else {
                    j++;
                    if (j <= n-1 && sb.charAt(j) == ' ') break;
                }
            }
            if (!ans.isEmpty()) ans.append(" ");
            ans.append(reverse(sb.substring(i,j)));
        }
        return reverse(ans.toString().trim()); // trim to avoid leading or trailing spaces.
    }

    //Here i is the start index, and j is the end index.
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = s.length()-1;
        while (i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        return sb.toString();
    }
}















