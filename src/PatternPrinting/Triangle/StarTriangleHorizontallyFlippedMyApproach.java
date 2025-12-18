package PatternPrinting.Triangle;
import java.util.Scanner;

//Left Lower Triangle pattern
public class StarTriangleHorizontallyFlippedMyApproach {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input -> ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

//        Input -> 5
//        *  *  *  *  *
//           *  *  *  *
//              *  *  *
//                 *  *
//                    *





