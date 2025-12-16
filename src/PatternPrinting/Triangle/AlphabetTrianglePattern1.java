package PatternPrinting.Triangle;
import java.util.Scanner;

//Left Lower Triangle pattern
public class AlphabetTrianglePattern1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(j+'A')+"  ");
            }
            System.out.println();
        }
    }
}

//        input -> 5
//        A
//        A  B
//        A  B  C
//        A  B  C  D
//        A  B  C  D  E