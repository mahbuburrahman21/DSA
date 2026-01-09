package Strings;

public class NumberOfVowelsInAString {
    static void main(String[] args) {
        String str = "Mahbub Is A Good Boy!";
        System.out.println(nOfVowels(str));
    }
    public static int nOfVowels(String str){
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowelCount++;
            else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') vowelCount++;
        }
        return vowelCount;
    }
}

