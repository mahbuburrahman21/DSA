package Strings;

public class StringComparison {
    static void main(String[] args) {
        String s1 = "harsh";
        String s2 = "harshita";
        System.out.println(s1.compareTo(s2));
        System.out.println(compareTo(s1,s2));
    }

    //My Function to compare string
    public static int compareTo(String a, String b){
        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length()){
            if (a.charAt(i) == b.charAt(j)){
                i++;
                j++;
            } else if (a.charAt(i) != b.charAt(j)) {
                return a.charAt(i)-b.charAt(j);
            }
        }
        int firstStr = a.length();
        int secondStr = b.length();

        if (firstStr == secondStr) return 0;
        else return firstStr-secondStr;
    }
}
