package Loops.AP_GP;
import java.util.Scanner;

//AP -> Arithmetic Progression
public class AP_method1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int n = input.nextInt();
        System.out.print("Input first term: ");
        int a = input.nextInt();
        System.out.print("Input difference: ");
        int d = input.nextInt();

        for (int i=1; i<=n; i++){
            if (a>0){
                System.out.print(a+" ");
                a += d;
            }
        }
    }
}