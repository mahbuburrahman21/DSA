package Strings;

public class ConcatString {
    static void main(String[] args) {

        String s1 = "Mahbub is a";
        String s2 = " good boy";
        String s3 = " and intelligent!";

        System.out.println(s1.concat(s2));

        String s = s1 + s2;
        System.out.println(s);

        s1 = s1 + s2;
        System.out.println(s1);

        s1 += s3;
        System.out.println(s1);

        s1 += 10;
        System.out.println(s1);

        s1 += 'r';
        System.out.println(s1);

        s1 += '\n';
        System.out.println(s1);

        s = 10 + s1;
        System.out.println(s);
    }
}
