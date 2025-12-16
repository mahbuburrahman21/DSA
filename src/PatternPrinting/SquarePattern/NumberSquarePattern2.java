package PatternPrinting.SquarePattern;

import java.util.Scanner;

public class NumberSquarePattern2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();


        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= range; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

//        input -> 4
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4