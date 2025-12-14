package Loops.Digits;

import java.util.Scanner;

public class SumOfNumberAndReverse {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        //if (n == 0) n = 8;
        int reverse = 0, sum = 0;

        while (n != 0){
            reverse *= 10;
            reverse += (n%10);
            sum += (n%10);
            n /=10;
        }
        System.out.println("Sum of the digits: "+sum);
        System.out.println("Reverse of the number: "+reverse);
    }
}
