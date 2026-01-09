package Strings;

import java.util.Scanner;

public class IntToString {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //How to cast int to String data type?
        String s = ""; // Step1: take an empty String.
        s += n; // Step2: concat the String with int.
        System.out.println(s);

        //Another way to typeCast the int to String
        String str = Integer.toString(n);
    }
}
