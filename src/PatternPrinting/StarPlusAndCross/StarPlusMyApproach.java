package PatternPrinting.StarPlusAndCross;

import java.util.Scanner;

public class StarPlusMyApproach {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size: ");
        int n = input.nextInt();
        //int mid = (int) Math.ceil((double) n /2);
        //int mid = n/2+1;

        if (n%2==0){
            System.out.println("Invalid input. Number should be odd.");
        } else {
            for (int i = 1; i <= n ; i++) {
                for (int j = 1; j <= n ; j++) {
                    //if (i==mid || j==mid){
                    if (i==(n/2+1) || j==(n/2+1)){
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}
//        Size: 7
//                 *
//                 *
//                 *
//        *  *  *  *  *  *  *
//                 *
//                 *
//                 *




