package Loops.Digits;

import java.util.Scanner;

public class SumOfDigits {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if (n == 0) n=8;
        int sum = 0;


        while (n != 0){
            //int temp = (n%10);
            //sum += temp;
            sum += (n%10);
            n/=10;
        }
        //In this case sum could be negative also.
        //If we give input -912 then the output will be -12
        // System.out.println("Sum of digit is: "+sum);
        //To solve this issue,
        //System.out.println("Sum of digit is: "+(sum>0? sum : -sum));
        //also another solution is,
        System.out.println("Sum of digit is: "+Math.abs(sum));
    }
}