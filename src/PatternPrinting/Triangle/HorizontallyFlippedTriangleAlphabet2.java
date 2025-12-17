package PatternPrinting.Triangle;

import java.util.Scanner;

public class HorizontallyFlippedTriangleAlphabet2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //64 -> A
        //96 -> a

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i ; j++) {         // j = 1 to n+1-i
                System.out.print((char)(i+64)+"  ");
            }
            System.out.println();
        }
    }
}
//        input -> 5
//        A  A  A  A  A
//        B  B  B  B
//        C  C  C
//        D  D
//        E
