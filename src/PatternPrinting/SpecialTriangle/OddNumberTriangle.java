package PatternPrinting.SpecialTriangle;

import java.util.Scanner;

public class OddNumberTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((2*j-1)+"  ");
            }
            System.out.println();
        }
    }
}

//        input -> 5
//
//        1
//        1  3
//        1  3  5
//        1  3  5  7
//        1  3  5  7  9

