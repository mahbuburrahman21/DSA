package Loops.Digits;

import java.util.Scanner;

public class DigitCount {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if (n == 0) n=8;
        int count = 0;


        while (n != 0){
            count++;
            System.out.println(n%10);
            n/=10;
        }
        System.out.println("Number of digit is: "+count);
    }
}
