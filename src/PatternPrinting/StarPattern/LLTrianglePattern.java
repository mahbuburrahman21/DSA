package PatternPrinting.StarPattern;
import java.util.Scanner;

//Left Lower Triangle pattern
public class LLTrianglePattern {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

//        size -> 4
//        *
//        *  *
//        *  *  *
//        *  *  *  *