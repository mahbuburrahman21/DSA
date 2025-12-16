package PatternPrinting.Triangle;

import java.util.Scanner;

public class HorizontallyFlippedTriangleAnotherApproach {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = n; // no of stars to be printed in each line

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a ; j++) {
                System.out.print("*  ");
            }
            a--;
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
