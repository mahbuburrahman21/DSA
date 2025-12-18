package PatternPrinting.Triangle;
import java.util.Scanner;

//Left Lower Triangle pattern
public class StarTriangleVerticallyFlippedMyApproach {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input -> ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

//       size -> 4
//                 *
//              *  *
//           *  *  *
//        *  *  *  *





