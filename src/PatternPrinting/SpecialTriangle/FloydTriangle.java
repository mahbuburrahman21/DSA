package PatternPrinting.SpecialTriangle;

import java.util.Scanner;

public class FloydTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println();
        int a =1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+"  ");
                a++;
            }
            System.out.println();
        }
    }
}

//      input -> 4
//      1
//      2  3
//      4  5  6
//      7  8  9  10



