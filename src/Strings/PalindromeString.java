package Strings;

public class PalindromeString {
    static void main(String[] args) {
        //String str = "malayalam"; // true
        //String str = "mom"; // true
        //String str = "dad"; // true
        //String str = "daad"; // true
        String str = "mahbub"; // false
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left <= right){
            char chL = str.charAt(left); //chL -> character at left
            char chR = str.charAt(right); //chR -> character at right
            if (chL != chR) return false;
            left++;
            right--;
        }
        return true;
    }
}
