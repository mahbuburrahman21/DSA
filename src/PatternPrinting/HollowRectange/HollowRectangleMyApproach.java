package PatternPrinting.HollowRectange;

import java.util.Scanner;

public class HollowRectangleMyApproach {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("row -> ");
        int row = input.nextInt();
        System.out.print("col -> ");
        int col = input.nextInt();

        for (int i = 1; i <= row; i++) {
                if (i==1 || i==row){
                    for (int k = 1; k <= col; k++) {
                        //printing all stars
                        System.out.print("*  ");
                    }
                }
                else {
                    for (int k = 1; k <= col; k++) {
                        if (k==1 || k==col){
                            System.out.print("*  ");
                        }
                        else {
                            System.out.print("   ");
                        }
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




