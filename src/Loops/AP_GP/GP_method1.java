package Loops.AP_GP;

import java.util.Scanner;

//GP -> Geometric Progression
//1,2,4,8....
public class GP_method1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of terms: ");
        int n = input.nextInt();
        long a = 1;

        for (int i=1; i<=n; i++){
            if (i==n){
                System.out.println(a);
            } else {
                System.out.println(a+",");
            }
            a *= 2;
        }
    }
}
