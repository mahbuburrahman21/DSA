package Loops.Series;

import java.util.Scanner;

// Series -> 1, n, 2, n-1, 3, n-2........
public class Series1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = input.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(i);
            System.out.println(n);
            n = n-1;
        }
    }
}
