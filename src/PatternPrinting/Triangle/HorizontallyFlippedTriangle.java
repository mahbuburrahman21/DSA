package PatternPrinting.Triangle;

import java.util.Scanner;

public class HorizontallyFlippedTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //Not a standard template. This works for * pattern but not good at other type like number or alphabet
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        //This is standard and mathematically correct approach.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i ; j++) {         // j = 1 to n+1-i
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
//        input -> 5
//        *  *  *  *  *
//        *  *  *  *
//        *  *  *
//        *  *
//        *
//        *  *  *  *  *
//        *  *  *  *
//        *  *  *
//        *  *
//        *
