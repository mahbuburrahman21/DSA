package PatternPrinting.Triangle;
import java.util.Scanner;

//Left Lower Triangle pattern
public class AlphabetTriangleVerticallyFlippedMyApproach {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input -> ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) { //loop for print space
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) { //loop for print star
                System.out.print((char)(i+64)+"  ");
            }
            System.out.println();
        }
    }
}

//        Input -> 5
//                    1
//                 1  2
//              1  2  3
//           1  2  3  4
//        1  2  3  4  5





