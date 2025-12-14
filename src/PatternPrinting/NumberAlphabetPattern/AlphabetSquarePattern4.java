package PatternPrinting.NumberAlphabetPattern;

import java.util.Scanner;

public class AlphabetSquarePattern4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();


        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= range; j++) {
                if (i%2 == 0){
                    System.out.printf("%c  ",(i+'A'-1));
                } else {
                    System.out.printf("%c  ",(i+'a'-1));
                }
            }
            System.out.println();
        }
    }
}

//         4
//         a  a  a  a
//         B  B  B  B
//         c  c  c  c
//         D  D  D  D
