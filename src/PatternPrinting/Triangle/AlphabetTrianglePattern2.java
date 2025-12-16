package PatternPrinting.Triangle;
import java.util.Scanner;

//Left Lower Triangle pattern
public class AlphabetTrianglePattern2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(i+64)+"  ");
            }
            System.out.println();
        }
    }
}

//        input -> 5
//        A
//        B  B
//        C  C  C
//        D  D  D  D
//        E  E  E  E  E