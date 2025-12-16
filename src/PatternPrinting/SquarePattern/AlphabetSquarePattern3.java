package PatternPrinting.SquarePattern;

import java.util.Scanner;

public class AlphabetSquarePattern3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();


        for (int i = 'A'; i < range+'A'; i++) {
            for (int j = 1; j <= range; j++) {
                System.out.print((char)i+"  ");
            }
            System.out.println();
        }
    }
}
//         4
//         A  A  A  A
//         B  B  B  B
//         C  C  C  C
//         D  D  D  D
