package Loops.Digits;

import java.util.Scanner;

public class ReverseOfNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        //if (n == 0) n = 8;
        int reverse = 0;


//        while (n != 0) {
//            reverse = ((reverse + (n % 10)) * 10);
//            n /= 10;
//            if (n==0){
//                reverse /= 10;
//            }
//        }
        //Another way to solve the code efficiently
        while (n != 0) {
            reverse *= 10;
            reverse += (n%10);
            n /= 10;
        }
        System.out.println(reverse);

    }
}