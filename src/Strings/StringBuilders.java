package Strings;

public class StringBuilders {
    static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("Mahbubur");
        s.append(" Rahman");
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());
        s.append(" SWE");
        System.out.println(s.length()+" "+s.capacity());
        s.append(" SWE");
        System.out.println(s.length()+" "+s.capacity());
        s.append(" SWE");
        System.out.println(s.length()+" "+s.capacity());

        s.setCharAt(1,'e');
        System.out.println(s);
        String t = s.toString(); // String t = s; gives error
        System.out.println(t);
    }
}
