package PatternPrinting.SpecialTriangle;

import java.util.Scanner;

public class BinaryTriangleMasterApproach {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2!=0){
                    System.out.print("0"+"  ");
                } else {
                    System.out.print("1"+"  ");
                }
            }
            System.out.println();
        }
    }
}
//Anything mod by 2 always will be either 0 or 1
// so, i%2 == (0 or 1)

//      input -> 4
//      1
//      0  1
//      1  0  1
//      0  1  0  1



