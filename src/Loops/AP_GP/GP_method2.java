package Loops.AP_GP;

import java.util.Scanner;

public class GP_method2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int n = input.nextInt();
        System.out.print("Input first term: ");
        int a = input.nextInt();
        System.out.print("Input ratio: ");
        int r = input.nextInt();

        for (int i=1; i<=n; i++){
            if (i==n){
                System.out.println(a);
            } else {
                System.out.println(a+",");
            }
            a *= r;
        }
    }
}