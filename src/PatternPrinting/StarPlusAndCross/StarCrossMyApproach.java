package PatternPrinting.StarPlusAndCross;

import java.util.Scanner;

public class StarCrossMyApproach {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size: ");
        int n = input.nextInt();
        //int a = n;
        if (n%2==0){
            System.out.println("Invalid input! Number should be odd.");
        } else {
            for (int i = 1; i <= n ; i++) {
                for (int j = 1; j <= n ; j++) {
                    if (i==j){
                        System.out.print("*  ");
                    //} else if (j==a) {
                    } else if (j==n+1-i) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
                //a--;
                System.out.println();
            }
        }
    }
}
//Here we can use an external variable a or j -> n+1-i logic.
//        Size: 7
//        *                 *
//           *           *
//              *     *
//                 *
//              *     *
//           *           *
//        *                 *





