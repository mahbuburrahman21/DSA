package GfgSolution;

public class SumOfAllSubstring {
    static void main(String[] args) {
        String str = "421";
        //sumSubstrings(str);
        System.out.println(sumSubstrings(str));
    }


    public static int sumSubstrings(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                int val = Integer.parseInt(str.substring(i,j));
                sum += val;
                //System.out.print(str.substring(i,j)+" ");
            }
        }
        return sum;
    }
}
