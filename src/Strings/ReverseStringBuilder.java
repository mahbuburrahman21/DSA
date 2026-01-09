package Strings;

public class ReverseStringBuilder {
    static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("Mahbub");

        //Built in reverse --->
        s.reverse();
        System.out.println(s);


        //Manual Reverse --->
        int i = 0, j = s.length()-1;
        while (i <= j){
            char temp1 = s.charAt(i);
            char temp2 = s.charAt(j);
            s.setCharAt(i,temp2);
            s.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(s);


        //Reverse a String process --->
        String str = "Maisha";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        str = sb.toString();
        System.out.println(str);
    }
}