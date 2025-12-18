package PatternPrinting.SpecialPattern;

import java.util.Scanner;

public class Bridge {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input n -> ");
        int n = input.nextInt();


        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("*  ");
        }
        System.out.println();

        int nsp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*  ");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*  ");
            }
            nsp+=2;
            System.out.println();
        }
    }
}
