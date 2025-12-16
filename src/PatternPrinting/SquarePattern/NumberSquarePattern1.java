package PatternPrinting.SquarePattern;

import java.util.Scanner;

public class NumberSquarePattern1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();


        for (int i = 0; i < range; i++) {
            for (int j = 1; j <= range; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//        input -> 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5