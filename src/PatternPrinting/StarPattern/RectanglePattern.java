package PatternPrinting.StarPattern;

import java.util.Scanner;

public class RectanglePattern {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//        row -> 4
//        col -> 8
//        * * * * * * * *
//        * * * * * * * *
//        * * * * * * * *
//        * * * * * * * *
