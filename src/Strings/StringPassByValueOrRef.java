package Strings;

import java.util.ArrayList;
import java.util.List;

public class StringPassByValueOrRef {
    static void main() {
        //String Immutability ---->
        String s = "mahbub";
        System.out.println("Before Change -> "+s);
        change1(s);
        System.out.println("After Change -> "+s);


        //ArrayList Mutability ---->
        List<String> list = new ArrayList<>();
        list.add("Mahbub");

        System.out.println("\nBefore change -> "+list);
        chang2(list);
        System.out.println("After change -> "+ list);


        //Use StringBuilder to change and play with String
        StringBuilder sb = new StringBuilder("Mahbub");
        System.out.println("\nBefore change -> "+sb);
        changeSB(sb);
        System.out.println("After change -> "+sb);

        //Modified String
        s = change2(s);
        System.out.println("\nAfter getting modified String -> "+s);

    }


    //Here we can see List is mutable.
    private static void chang2(List<String> list) {
        list.add("Dr.");
        list.add("Rahman");
        list.add("Rahman");
        list.remove(2);
    }

    //From this we can see String pass by value only. Not reference
    //If we change the string in another method, the change will only work at that method.
    //Not actual change.
    private static void change1(String s) {
        s = "Noor";
        System.out.println("From change1 method -> "+ s);
    }
    //But we can return modified String
    private static String change2(String s) {
        s = "Noor";
        return s;
    }



    // If we want to change the String And work with it,
    private static void changeSB(StringBuilder sb) {
        sb.append(" Rahman");
    }


}
