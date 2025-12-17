package PatternPrinting.HollowRectange;

import java.util.Scanner;

public class HollowRectangleMasterApproach {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("row -> ");
        int row = input.nextInt();
        System.out.print("col -> ");
        int col = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col ; j++) {
                if (i==1 || j==1 || i==row || j==col){
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
//        row -> 4
//        col -> 6
//        *  *  *  *  *  *
//        *              *
//        *              *
//        *  *  *  *  *  *