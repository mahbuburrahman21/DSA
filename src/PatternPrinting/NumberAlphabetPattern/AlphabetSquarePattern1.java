package PatternPrinting.NumberAlphabetPattern;

import java.util.Scanner;

public class AlphabetSquarePattern1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();


        for (int i = 0; i < range; i++) {
            for (int j = 'A'; j <= 'A'+range-1; j++) {
                System.out.print((char)j+"  ");
            }
            System.out.println();
        }
    }
}
//     input -> 4
//     A  B  C  D
//     A  B  C  D
//     A  B  C  D
//     A  B  C  D