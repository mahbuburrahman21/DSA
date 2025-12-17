package PatternPrinting.Triangle;

import java.util.Scanner;

public class HorizontallyFlippedTriangleAlphabet1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i ; j++) {         // j = 1 to n+1-i
                System.out.print((char)(j+96)+"  ");
            }
            System.out.println();
        }
    }
}
//        input -> 5
//        a  b  c  d  e
//        a  b  c  d
//        a  b  c
//        a  b
//        a
