package Loops.AP_GP;

import java.util.Scanner;

public class AP_method2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first term: ");
        int a = input.nextInt();
        System.out.print("Input difference: ");
        int d = input.nextInt();

        for (int i = a; i > 0 ; i+=d) {
            System.out.print(i+" ");
        }
    }
}
