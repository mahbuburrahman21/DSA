package PatternPrinting.Triangle;
import java.util.Scanner;

//Left Lower Triangle pattern
public class StarTriangleVerticallyFlippedApproach2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input -> ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if ((i+j)>n){
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
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





