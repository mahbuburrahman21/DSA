package PatternPrinting.NumberAlphabetPattern;
import java.util.Scanner;

//Left Lower Triangle pattern
public class NumberTrianglePattern {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}

//        input -> 5
//        1
//        1  2
//        1  2  3
//        1  2  3  4
//        1  2  3  4  5