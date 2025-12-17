package PatternPrinting.SpecialTriangle;

import java.util.Scanner;

public class BinaryTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println();
        //int a =1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"  ");
                //a++;
            }
            System.out.println();
        }
    }
}

//      input -> 4
//      1
//      0  1
//      1  0  1
//      0  1  0  1



