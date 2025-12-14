package PatternPrinting.NumberAlphabetPattern;

import java.util.Scanner;

public class AlphabetSquarePattern2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();


        for (int i = 0; i < range; i++) {
            for (int j = 'a'; j < 'a'+range; j++) {
                System.out.print((char)j+"  ");
            }
            System.out.println();
        }
    }
}
//      input -> 5
//      a  b  c  d  e
//      a  b  c  d  e
//      a  b  c  d  e
//      a  b  c  d  e
//      a  b  c  d  e
