package PatternPrinting.SpecialPattern;
import java.util.Scanner;

//Left Lower Triangle pattern
public class Diamond {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input -> ");
        int n = input.nextInt();

        //nsp = number of space
        //nst = number of stars
        int nsp = n-1, nst = 1;

        for (int i = 1; i <= n; i++) { // lines
            for (int j = 1; j <= nsp; j++) { // Spaces
                System.out.print("   ");
            }
            for (int j = 1; j <= nst; j++) { // Stars
                System.out.print("*  ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
        nsp = 1;
        nst = 2*n-3;
        for (int i = 1; i <= n; i++) { // lines
            for (int j = 1; j <= nsp; j++) { // Spaces
                System.out.print("   ");
            }
            for (int j = 1; j <= nst; j++) { // Stars
                System.out.print("*  ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}

//        Input -> 4
//                    *
//                 *  *  *
//              *  *  *  *  *
//           *  *  *  *  *  *  *
//              *  *  *  *  *
//                 *  *  *
//                    *



