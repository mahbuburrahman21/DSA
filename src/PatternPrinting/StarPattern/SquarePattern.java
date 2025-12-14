package PatternPrinting.StarPattern;

import java.util.Scanner;

public class SquarePattern {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();


        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
//        input -> 5
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *