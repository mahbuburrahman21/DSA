package Loops.ContextLess;

import java.util.Scanner;

public class ARaiseToThePowerB {
    static void main(String[] args) {
        System.out.println("Calculate x raise To the power n.......");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1 ; i <= n ; i++){
            result *= x;
        }
        System.out.println(result);

    }
}
