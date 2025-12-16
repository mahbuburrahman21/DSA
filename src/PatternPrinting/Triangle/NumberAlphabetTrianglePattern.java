package PatternPrinting.Triangle;
import java.util.Scanner;

//Left Lower Triangle pattern
public class NumberAlphabetTrianglePattern {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%2 ==0){
                    System.out.print((char)(j+64)+"  ");
                } else {
                    System.out.print(j+"  ");
                }


            }
            System.out.println();
        }
    }
}

//        input -> 5
//        1
//        A  B
//        1  2  3
//        A  B  C  D
//        1  2  3  4  5