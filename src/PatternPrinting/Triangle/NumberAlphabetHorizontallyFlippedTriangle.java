package PatternPrinting.Triangle;

import java.util.Scanner;

public class NumberAlphabetHorizontallyFlippedTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //This is standard and mathematically correct approach.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i ; j++) {         // j = 1 to n+1-i
                System.out.print(j+"  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i ; j++) {         // j = 1 to n+1-i
                System.out.print( (char)(j+64)+"  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i ; j++) {         // j = 1 to n+1-i
                System.out.print( (char)(j+96)+"  ");
            }
            System.out.println();
        }
    }
}
//        input -> 5
//        1  2  3  4  5
//        1  2  3  4
//        1  2  3
//        1  2
//        1

//        A  B  C  D  E
//        A  B  C  D
//        A  B  C
//        A  B
//        A

//        a  b  c  d  e
//        a  b  c  d
//        a  b  c
//        a  b
//        a

